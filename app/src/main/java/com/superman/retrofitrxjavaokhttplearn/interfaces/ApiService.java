package com.superman.retrofitrxjavaokhttplearn.interfaces;

import com.superman.retrofitrxjavaokhttplearn.beans.Info;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * 作者 Superman
 * 日期 2018/12/6 14:01.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 api接口类
 */

public interface ApiService {
    @Headers("Cache-Control: public, max-age=10")//设置缓存 缓存时间为10s
    @GET("journalismApi")
    Observable<Info> getInfo();
}
