package com.superman.retrofit.common;

import retrofit2.Retrofit;

/**
 * api接口工具类
 * 通过Class<T> cls泛型来规定传入的service类型可以用来区分不同的类型接口
 * 用于创建retrofit
 */

public class CommonApiUtils {
    public static <T> T getApiService(Class<T> cls, String baseUrl) {
        Retrofit retrofit = RetrofitUtils.getRetrofitBuilder(baseUrl).build();
        return retrofit.create(cls);
    }
}
