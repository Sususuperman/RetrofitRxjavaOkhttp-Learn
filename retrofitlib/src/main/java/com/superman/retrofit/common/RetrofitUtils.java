package com.superman.retrofit.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.superman.retrofit.converter.GsonConverterFactory;
import com.superman.retrofit.interceptor.HttpCacheInterceptor;
import com.superman.retrofit.interceptor.HttpHeaderInterceptor;
import com.superman.retrofit.interceptor.LoggingInterceptor;
import com.superman.retrofit.utils.Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * 作者 Superman
 * 日期 2018/12/4 14:00.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 RetrofitUtils用来构建Retrofit.Builder
 */

public class RetrofitUtils {

    /**
     * addInterceptor   设置拦截器
     * cookieJar    设置cook管理类
     * readTimeout   设置读取超时时间
     * writeTimeout  设置写的超时时间
     * connectTimeout  设置链接超时时间
     * retryOnConnectionFailure 设置是否重试链接
     */
    public static OkHttpClient.Builder getOkhttpBuilder() {
        File cacheFile = new File(Utils.getContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100);
        return new OkHttpClient.Builder()
                .readTimeout(Constants.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(Constants.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(Constants.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(new HttpCacheInterceptor())
                .addInterceptor(new HttpHeaderInterceptor())
                .addNetworkInterceptor(new LoggingInterceptor())
                .cache(cache)
                ;
    }

    public static Retrofit.Builder getRetrofitBuilder(String baseurl) {
        //使用GsonBuilder来创建Gson对象，在创建过程中调用GsonBuilder.setDateFormat(String)指定一个固定的格式
        //serializeNulls配置GSON以序列化空字段。默认情况下，Gson省略所有字段。
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
        OkHttpClient okHttpClient = getOkhttpBuilder().build();
        return new Retrofit.Builder()
                .client(okHttpClient)
                //通过GsonConverterFactory获取真实响应数据
                .addConverterFactory(GsonConverterFactory.create(gson))//自定义的GsonConverterFactory，用于拦截数据统一处理异常和数据，直接copy的源码
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseurl);
    }
}
