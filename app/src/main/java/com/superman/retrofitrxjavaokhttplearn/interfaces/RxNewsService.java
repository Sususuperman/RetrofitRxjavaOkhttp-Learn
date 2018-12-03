package com.superman.retrofitrxjavaokhttplearn.interfaces;

import com.superman.retrofitrxjavaokhttplearn.beans.News;


import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者 Superman
 * 日期 2018/11/28 18:07.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public interface RxNewsService {
    //接口类中的修改，不能返回Call对象了，要返回被观察者，
    // 观察者观察网络请求，将网络请求当做被观察者，完成一个异步操作。
    @GET("toutiao/index")
    Observable<News> getNews(@Query("type") String type, @Query("key") String key);

}
