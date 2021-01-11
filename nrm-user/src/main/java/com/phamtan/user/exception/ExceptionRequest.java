package com.phamtan.user.exception;

public class ExceptionRequest extends RuntimeException {
    public ExceptionRequest(String message) {
        super(message);
    }
    public ExceptionRequest() {
        super();
    }
}

