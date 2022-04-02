package com.jasper.exceptionhandler.exception;

import com.jasper.exceptionhandler.constant.Status;

/**
 * 页面异常
 *
 * @author jasper
 * @date 2022-04-02 14:55
 */
public class PageException extends BaseException {
    public PageException(Status status) {
        super(status);
    }

    public PageException(Integer code, String message) {
        super(code, message);
    }
}
