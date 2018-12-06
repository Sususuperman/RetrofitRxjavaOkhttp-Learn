package com.superman.retrofit.common;

/**
 * 作者 Superman
 * 日期 2018/12/4 11:26.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述 基础数据返回的基类，可根据自己的服务器返回的数据格式进行创建，泛型T来接收你要的数据
 */

public class BasicResponse<T> {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
