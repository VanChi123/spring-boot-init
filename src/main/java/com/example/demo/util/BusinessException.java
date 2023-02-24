package com.example.demo.util;

import com.example.demo.util.enums.ResponseStatusCodeEnum;
import com.example.demo.util.exception.BaseException;
import lombok.Getter;

import java.util.Map;

@Getter
public class BusinessException extends BaseException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, ResponseStatusCodeEnum responseCode) {
        super(message, responseCode);
    }

    public BusinessException(ResponseStatusCodeEnum responseCode) {
        super(responseCode);
    }

    public BusinessException(ResponseStatusCodeEnum responseCode, Object returnObject, Map<Object, Object> errorMessageParam) {
        super(responseCode, returnObject, errorMessageParam);
    }

    public BusinessException(ResponseStatusCodeEnum responseCode, Object returnObject) {
        super(responseCode, returnObject);
    }

    public BusinessException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BusinessException(String message, Throwable throwable, ResponseStatusCodeEnum responseCode) {
        super(message, throwable, responseCode);
    }
}

