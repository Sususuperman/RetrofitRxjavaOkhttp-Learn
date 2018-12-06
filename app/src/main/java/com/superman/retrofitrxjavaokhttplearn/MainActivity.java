package com.superman.retrofitrxjavaokhttplearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.superman.com.retrofitrxjavaokhttp_learn.R;
import com.superman.retrofit.common.BasicObservar;
import com.superman.retrofit.utils.RxUtil;
import com.superman.retrofit.utils.ToastUtils;
import com.superman.retrofitrxjavaokhttplearn.beans.Info;
import com.superman.retrofitrxjavaokhttplearn.beans.News;
import com.superman.retrofitrxjavaokhttplearn.interceptor.MyIntercept;
import com.superman.retrofitrxjavaokhttplearn.interfaces.NewsService;
import com.superman.retrofitrxjavaokhttplearn.interfaces.RxNewsService;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends RxAppCompatActivity {
    public static final String BASE_URL = "http://v.juhe.cn/";
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textview);
//        getNewsByRetrofit();
//        getNewsByRetrofitOkhttp();
//        getNewsByRetrofitOkhttpRxjava();
//        a();
        requestData();
    }

    private void requestData() {
        RetrofitHelper.getApiService()
                .getInfo()
                .compose(RxUtil.<Info>rxSchedulerHelper(this))
                .subscribe(new BasicObservar<Info>() {
                    @Override
                    public void onSuccess(Info info) {

                        tv.setText(info.getTech().get(0).getTitle());
                    }

                    @Override
                    public void onFail(String msg) {
                        ToastUtils.show(msg);
                    }
                });
    }

    /*
     *获取类名行数
     */
    private void a() {
        b();
    }

    private void b() {
        StringBuffer sb = new StringBuffer();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();//通过当前的线程，拿到当前调用的栈帧集合可以理解为当我们调用方法的时候，每进入一个方法，会将该方法的相关信息（例如：类名，方法名，方法调用行数等）存储下来，
        // 压入到一个栈中，当方法返回的时候再将其出栈。
        for (StackTraceElement e : stack) {
            sb.append("\tat ");
            sb.append(e.toString());
            sb.append("\n");
        }
        Log.e("tag", sb.toString());
    }

    /**
     * 通过retrofit+gson的形式获取网络数据并解析，没有进行任何的封装。（retrofit内部用的就是okhttp的网络请求）
     */
    private void getNewsByRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();//配置了接口的 BASE_URL 和一个 converter , GsonConverterFactory 是默认提供的 Gson转换器。

        NewsService newsService = retrofit.create(NewsService.class);
        //调用方法得到一个Call
        Call<News> call = newsService.getNews("toutiao", "846085d568a09904fe51aa42123f41bc");
        //进行网络请求
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                List<News.ResultBean.DataBean> list = response.body().getResult().getData();
                for (News.ResultBean.DataBean dataBean : list) {
                    tv.setText(dataBean.getTitle());
                }
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }


    /**
     * 添加okhttp配置
     */
    private void getNewsByRetrofitOkhttp() {
        //添加请求日志打印拦截器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        /**
         * addInterceptor   设置拦截器
         * cookieJar    设置cook管理类
         * readTimeout   设置读取超时时间
         * writeTimeout  设置写的超时时间
         * connectTimeout  设置链接超时时间
         * retryOnConnectionFailure 设置是否重试链接
         */
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new MyIntercept())
                .addInterceptor(httpLoggingInterceptor)
//                .cookieJar()
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();//配置了接口的 BASE_URL 和一个 converter , GsonConverterFactory 是默认提供的 Gson转换器。

        NewsService newsService = retrofit.create(NewsService.class);
        //调用方法得到一个Call
        Call<News> call = newsService.getNews("toutiao", "846085d568a09904fe51aa42123f41bc");
        //进行网络请求
        call.enqueue(new Callback<News>()

        {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                List<News.ResultBean.DataBean> list = response.body().getResult().getData();
                for (News.ResultBean.DataBean dataBean : list) {
                    tv.setText(dataBean.getTitle());
                }
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }


    /**
     * 添加rxjava
     */
    private void getNewsByRetrofitOkhttpRxjava() {
        //添加请求日志打印拦截器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        /**
         * addInterceptor   设置拦截器
         * cookieJar    设置cook管理类
         * readTimeout   设置读取超时时间
         * writeTimeout  设置写的超时时间
         * connectTimeout  设置链接超时时间
         * retryOnConnectionFailure 设置是否重试链接
         */
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new MyIntercept())
                .addInterceptor(httpLoggingInterceptor)
//                .cookieJar()
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//添加Rxjava
                .build();//配置了接口的 BASE_URL 和一个 converter , GsonConverterFactory 是默认提供的 Gson转换器。

        RxNewsService rxNewsService = retrofit.create(RxNewsService.class);
        //网络请求拿到的接口对象
        Observable<News> observable = rxNewsService.getNews("toutiao", "846085d568a09904fe51aa42123f41bc");
        //执行异步网络操作：
        //这里用的是rxjava2，所以对应被观察者（上游）Observable变成Flowable，下游Observer就变成了Subscriber
        //subscribeOn(Schedulers.io())指定被观察者事件发生io线程，耗时操作
        //observeOn(AndroidSchedulers.mainThread())指定观察者事件发生在主线程，更新UI必须在主线程中。
        // subscribe（new Subscriber…..） 被观察者订阅观察者。
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<News>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(News news) {
                        List<News.ResultBean.DataBean> list = news.getResult().getData();
                        for (News.ResultBean.DataBean dataBean : list) {
                            tv.setText(dataBean.getTitle());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


}
