package com.jasper.exceptionhandler.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态码封装
 *
 * @author jasper
 * @date 2022-04-02 14:54
 */
@Getter
@AllArgsConstructor
public enum Status {
    /**
     * 操作成功
     */
    OK(200, "操作成功"),

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(500, "服务器出错啦");

    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 内容
     */
    private final String message;
}
