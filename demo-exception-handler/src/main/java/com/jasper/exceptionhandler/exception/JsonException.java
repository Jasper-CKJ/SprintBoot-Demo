package com.jasper.exceptionhandler.exception;

import com.jasper.exceptionhandler.constant.Status;
import lombok.Getter;

/**
 * JSON 异常
 *
 * @author jasper
 * @date 2022-04-02 14:55
 */
@Getter
public class JsonException extends BaseException {
    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
