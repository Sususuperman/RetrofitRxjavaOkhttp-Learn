package com.superman.retrofit.utils;

import android.content.Context;

/**
 * 作者 Superman
 * 日期 2018/12/4 14:31.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class Utils {
    private static Context context;

    private Utils()

    {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类，在application中初始化
     *
     * @param context
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取pplicationContext对象
     *
     * @return
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }

}
