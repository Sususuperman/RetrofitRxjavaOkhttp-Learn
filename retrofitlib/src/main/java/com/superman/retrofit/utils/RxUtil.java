package com.superman.retrofit.utils;

import com.superman.retrofit.common.ProgressUtils;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.android.FragmentEvent;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.trello.rxlifecycle2.components.support.RxFragment;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 转换工具类
 * activity fragement
 * 处理加载和生命周期
 *
 * @author Superman
 */
public class RxUtil {

    /**
     * 统一线程处理
     * ObservableTransformer
     * 顾名思义是转换器
     * Transformer 能够将一个 Observable/Flowable/Single/Completable/Maybe 对象转换成另一个
     * Observable/Flowable/Single/Completable/Maybe 对象，和调用一系列的内联操作符是一模一样的。
     *
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper(final RxAppCompatActivity activity) {    //compose简化线程
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .compose(ProgressUtils.<T>applyProgressBar(activity))
                        .compose(activity.<T>bindUntilEvent(ActivityEvent.DESTROY));
            }
        };
    }

    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> rxSchedulerHelper(final RxFragment fragment) {    //compose简化线程
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .compose(ProgressUtils.<T>applyProgressBar(fragment.getActivity()))
                        .compose(fragment.<T>bindUntilEvent(FragmentEvent.DESTROY_VIEW));
            }
        };
    }


}
