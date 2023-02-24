package com.example.demo.util.exception;

import com.example.demo.util.enums.ResponseStatusCodeEnum;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Getter
@Slf4j
public abstract class BaseException extends Throwable {
    private ResponseStatusCodeEnum responseCode;
    private Object returnObject;
    private Map<Object, Object> errorMessageParam;

    public BaseException(String message) {
        super(message);
        log.error(message, this);
    }

    public BaseException(String message, ResponseStatusCodeEnum responseCode) {
        super(message);
        this.responseCode = responseCode;
        log.error(message, this);
    }

    public BaseException(ResponseStatusCodeEnum responseCode) {
        super(responseCode.getCode());
        this.responseCode = responseCode;
        log.error(responseCode.getCode(), this);
    }

    public BaseException(ResponseStatusCodeEnum responseCode, Object returnObject, Map<Object, Object> errorMessageParam) {
        super(responseCode.getCode());
        this.responseCode = responseCode;
        this.returnObject = returnObject;
        this.errorMessageParam = errorMessageParam;
        log.error(responseCode.getCode(), this);
    }

    public BaseException(ResponseStatusCodeEnum responseCode, Object returnObject) {
        super(responseCode.getCode());
        this.responseCode = responseCode;
        this.returnObject = returnObject;
        log.error(responseCode.getCode(), this);
    }

    public BaseException(ResponseStatusCodeEnum responseCode, Object returnObject, String message) {
        super(message);
        this.responseCode = responseCode;
        this.returnObject = returnObject;
        log.error(message, this);
    }

    public BaseException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BaseException(String message, Throwable throwable, ResponseStatusCodeEnum responseCode) {
        super(message, throwable);
        this.responseCode = responseCode;
        log.error(message, this);
    }
}