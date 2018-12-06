package com.superman.retrofit.exception;

/**
 * 服务器返回的异常
 */
public class NoDataExceptionException extends RuntimeException {
    public NoDataExceptionException() {
        super("服务器没有返回对应的data数据", new Throwable("Server error"));
    }
}
