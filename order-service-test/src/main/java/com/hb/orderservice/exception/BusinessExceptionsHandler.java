package com.hb.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessExceptionsHandler {

    @ExceptionHandler
    public ErrorResponseDto handleBusinessExceptions(BusinessExceptions ex){
        return ErrorResponseDto.builder()
                .status("FAILED")
                .errorMessage(ex.getMessage())
                .statusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
                .type(ex.getClass().getSimpleName())
                .build();
    }
}
