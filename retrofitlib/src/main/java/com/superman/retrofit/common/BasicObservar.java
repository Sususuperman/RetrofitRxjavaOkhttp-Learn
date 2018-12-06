package com.superman.retrofit.common;


import android.widget.Toast;

import com.google.gson.JsonParseException;
import com.superman.com.retrofitlib.R;
import com.superman.retrofit.exception.NoDataExceptionException;
import com.superman.retrofit.exception.ServerResponseException;
import com.superman.retrofit.utils.LogUtils;
import com.superman.retrofit.utils.ToastUtils;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.Observer;
import retrofit2.HttpException;

import static com.superman.retrofit.common.BasicObservar.ExceptionReason.BAD_NETWORK;
import static com.superman.retrofit.common.BasicObservar.ExceptionReason.CONNECT_ERROR;
import static com.superman.retrofit.common.BasicObservar.ExceptionReason.CONNECT_TIMEOUT;
import static com.superman.retrofit.common.BasicObservar.ExceptionReason.PARSE_ERROR;
import static com.superman.retrofit.common.BasicObservar.ExceptionReason.UNKNOWN_ERROR;

/**
 * 作者 Superman
 * 日期 2018/12/5 15:48.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 没有网络、请求超时或者服务器返回了数据但在解析时出现了数据解析异常等。
 * 对于这样的情况我们也要进行统一处理的。那么我们就需要自定义一个DefaultObserver类继承Observer，并重写相应的方法。
 * 该类中最重要的两个方法时onNext和onError。
 */

public abstract class BasicObservar<T> implements Observer<T> {


    /**
     * 服务器数据返回成功的时候会调用onNext()方法
     * @param t
     */
    @Override
    public void onNext(T t) {
       onSuccess(t);
       onFinish();
    }


    @Override
    public void onError(Throwable e) {
        LogUtils.e("Retrofit",e.getMessage());
        //对异常进行统一分类处理
        if (e instanceof com.jakewharton.retrofit2.adapter.rxjava2.HttpException) {     //   HTTP错误
            handleException(ExceptionReason.BAD_NETWORK);
        } else if (e instanceof ConnectException
                || e instanceof UnknownHostException) {   //   连接错误
            handleException(ExceptionReason.CONNECT_ERROR);
        } else if (e instanceof InterruptedIOException) {   //  连接超时
            handleException(ExceptionReason.CONNECT_TIMEOUT);
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {   //  解析错误
            handleException(ExceptionReason.PARSE_ERROR);
        }else if(e instanceof ServerResponseException){
            onFail(e.getMessage());
        }else if (e instanceof NoDataExceptionException){
            onSuccess(null);//无数据也算成功，可根据业务需求更改
        } else {
            handleException(ExceptionReason.UNKNOWN_ERROR);
        }

        onFinish();
    }

    private void handleException(ExceptionReason reason) {
        switch (reason) {
            case CONNECT_ERROR:
                ToastUtils.show(R.string.connect_error, Toast.LENGTH_SHORT);
                break;

            case CONNECT_TIMEOUT:
                ToastUtils.show(R.string.connect_timeout, Toast.LENGTH_SHORT);
                break;

            case BAD_NETWORK:
                ToastUtils.show(R.string.bad_network, Toast.LENGTH_SHORT);
                break;

            case PARSE_ERROR:
                ToastUtils.show(R.string.parse_error, Toast.LENGTH_SHORT);
                break;

            case UNKNOWN_ERROR:
            default:
                ToastUtils.show(R.string.unknown_error, Toast.LENGTH_SHORT);
                break;
        }
    }

    /**
     * 服务器返回数据
     * @param t
     */
    abstract void onSuccess(T t);

    /**
     * 服务器返回错误码code之类的，可根据具体接口的规范
     * @param msg
     */
    abstract void onFail(String msg);

    /**
     * 自定义一些处理
     */
    private void onFinish() {}

    public enum ExceptionReason{
        /**
         * 解析数据失败
         */
        PARSE_ERROR,
        /**
         * 网络问题
         */
        BAD_NETWORK,
        /**
         * 连接错误
         */
        CONNECT_ERROR,
        /**
         * 连接超时
         */
        CONNECT_TIMEOUT,
        /**
         * 未知错误
         */
        UNKNOWN_ERROR,
    }
}
