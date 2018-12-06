package com.superman.retrofit.common;

import android.app.Activity;

import com.superman.retrofit.dialog.WaitDialog;

import java.lang.ref.WeakReference;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * 作者 Superman
 * 日期 2018/12/6 9:54.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 进度条加载工具类，通过ObservableTransformer转换 控制进度条的加载
 * 通过RxJava的compose操作符来做一个非常优雅的处理。首先定义一个ProgressUtils工具类，
 * 然后通过RxJava的ObservableTransformer做一个变换来处理Loading。想要显示Loading，只需要加上.compose(ProgressUtils.< T >applyProgressBar(this))即可。
 */

public class ProgressUtils {

    public static <T> ObservableTransformer<T, T> applyProgressBar(@NonNull Activity activity, String msg)

    {
        final WeakReference<Activity> weakReference = new WeakReference<Activity>(activity);
        final WaitDialog waitDialog = new WaitDialog(weakReference.get(), msg);
        waitDialog.show();
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                //doOnSubscribe 在观察者订阅时使用
                return upstream.doOnSubscribe(new Consumer<Disposable>() {//Consumer操作符参考https://www.jianshu.com/p/464fa025229e
                    //
                    @Override
                    public void accept(Disposable disposable) throws Exception {

                    }
                }).doOnTerminate(new Action() {//doOnTerminate() Observable终止之前会被调用，无论是正 常还是异常终止。这里对加载框进行关闭操作
                    @Override
                    public void run() throws Exception {
                        if (weakReference.get() != null && !weakReference.get().isFinishing()) {
                            waitDialog.dismiss();
                        }
                    }
                });
            }
        };
    }

    /**
     * 给一个默认的加载框提示“加载中...”
     * @param activity
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> applyProgressBar(
            @android.support.annotation.NonNull final Activity activity) {
        return applyProgressBar(activity, "加载中...");
    }

}
