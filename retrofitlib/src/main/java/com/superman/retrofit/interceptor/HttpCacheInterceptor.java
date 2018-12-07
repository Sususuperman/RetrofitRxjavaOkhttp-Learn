package com.superman.retrofit.interceptor;

import com.orhanobut.logger.Logger;
import com.superman.retrofit.utils.LogUtils;
import com.superman.retrofit.utils.NetworkUtils;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者 Superman
 * 日期 2018/12/4 14:57.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 配置缓存的拦截器
 */

public class HttpCacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (!NetworkUtils.isConnected()) {//无网络状态下强制从缓存读取
            request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE)
                    .build();
            LogUtils.d("Okhttp", "no network");
        }

        Response response = chain.proceed(request);
        if (NetworkUtils.isConnected()) {
            //有网的话就读取header配置
            String cacheControl = request.cacheControl().toString();
            return response.newBuilder().header("Cache-Control", cacheControl)
                    .removeHeader("Pragma")//移除它的原因是因为pragma也是控制缓存的一个消息头属性
                    .build();
        } else {
            int maxStale = 60 * 60 * 6; // 没网失效6小时
            return response.newBuilder()
                    //only-if-cached表示只接受被缓存的内容,max-stale 允许读取过期时间小于max-stale 值的缓存对象
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)//
                    .removeHeader("Pragma")//移除它的原因是因为pragma也是控制缓存的一个消息头属性
                    .build();
        }
    }
}
