package com.superman.retrofitrxjavaokhttplearn.interfaces;

import com.superman.retrofitrxjavaokhttplearn.beans.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者 Superman
 * 日期 2018/11/28 18:07.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public interface NewsService {
    //获取豆瓣Top250 榜单
    @GET("toutiao/index")
    Call<News> getNews(@Query("type") String type, @Query("key") String key);

}
