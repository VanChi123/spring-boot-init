package com.example.demo.rest.validator;

import org.hibernate.service.spi.ServiceException;

public abstract class BaseValidator<T> {
    public abstract void validate(T request) throws ServiceException;
}
