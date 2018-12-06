package com.superman.retrofitrxjavaokhttplearn;

import android.app.Application;
import android.content.Context;

import com.superman.retrofit.utils.Utils;

import java.util.logging.Logger;

/**
 * 作者 Superman
 * 日期 2018/12/5 14:13.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class MyApp extends Application{
    private static MyApp app;
    public Context getAppContext(){
        return app;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        Utils.init(this);

    }
}
