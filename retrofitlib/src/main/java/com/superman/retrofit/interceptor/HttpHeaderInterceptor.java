package com.superman.retrofit.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 */

public class HttpHeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        //  配置请求头
        String accessToken = "token";
        String tokenType = "tokenType";
        Request request = chain.request().newBuilder()
//                .header("app_key", "appId")
//                .header("Authorization", tokenType + " " + accessToken)
                .header("Content-Type", "application/json")
//在http1.1中，client和server都是默认对方支持长链接的， 如果client使用http1.1协议，但又不希望使用长链接，
// 则需要在header中指明connection的值为close；如果server方也不想支持长链接，则在response中也需要明确说明connection的值为close.
                //                .addHeader("Connection", "close")
//                .addHeader("Accept-Encoding", "identity")
                .build();
        return chain.proceed(request);
    }
}
