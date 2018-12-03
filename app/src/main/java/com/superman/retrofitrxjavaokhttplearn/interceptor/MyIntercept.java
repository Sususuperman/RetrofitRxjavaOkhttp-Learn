package com.superman.retrofitrxjavaokhttplearn.interceptor;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者 Superman
 * 日期 2018/11/29 11:18.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 设置okhttp的拦截器
 */

public class MyIntercept implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl httpUrl = request.url()
                .newBuilder()
                //添加公共的一些参数，比如token，id等
//                .addQueryParameter("token","dadfdgadsfadf")
                .build();
        Request build = request.newBuilder()
                //添加头部
                .addHeader("contentType", "text/json")
                .url(httpUrl)
                .build();
        Response response = chain.proceed(build);
        return response;
    }
}
