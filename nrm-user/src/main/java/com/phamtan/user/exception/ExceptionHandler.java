package com.phamtan.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Date;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = ExceptionRequest.class)
    public ResponseEntity<Object> handlerApiRequestException(ExceptionRequest exceptionRequest){
        HttpStatus badRequest = HttpStatus.BAD_REQUEST ;
        ApiExceptionResponse apiExceptionResponse = new ApiExceptionResponse(
                exceptionRequest.getMessage(),
                badRequest,
                new Date()
        );
        return new ResponseEntity<>(apiExceptionResponse,badRequest);
    }
}
