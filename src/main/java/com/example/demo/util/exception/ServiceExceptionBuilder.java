package com.example.demo.util.exception;

import com.example.demo.rest.validator.ServiceException;
import com.example.demo.util.common.rest.dto.ValidationErrorResponse;

import java.util.ArrayList;
import java.util.List;

public class ServiceExceptionBuilder {
    public ServiceExceptionBuilder() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        public List<ValidationErrorResponse> errors = new ArrayList();

        public Builder() {
        }

        public Builder addError(ValidationErrorResponse errorResponse) {
            this.errors.add(errorResponse);
            return this;
        }

        public ServiceException build() {
            return new ServiceException("failed", this.errors);
        }
    }
}