package com.superman.retrofitrxjavaokhttplearn;

import com.superman.retrofit.common.CommonApiUtils;
import com.superman.retrofit.common.Constants;
import com.superman.retrofitrxjavaokhttplearn.interfaces.ApiService;

/**
 * 作者 Superman
 * 日期 2018/12/6 13:59.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class RetrofitHelper {
    private static ApiService apiService;

    public static ApiService getApiService() {
        if (apiService == null) {
            apiService = CommonApiUtils.getApiService(ApiService.class, Constants.BASE_API);
        }
        return apiService;
    }
}
