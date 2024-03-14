package com.hb.orderservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(InvalidProductIdException.class)
    public ErrorResponseDto handleInvalidProductIdException(InvalidProductIdException ex){
        return ErrorResponseDto.builder()
                .status("FAILED")
                .errorMessage(ex.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR)
                .build();
    }

    @ExceptionHandler(OrderNotExistException.class)
    public ErrorResponseDto handleOrderNotExistException(OrderNotExistException ex){
        return ErrorResponseDto.builder()
                .status("FAILED")
                .errorMessage(ex.getMessage())
                .statusCode(HttpStatus.EXPECTATION_FAILED)
                .build();
    }
}
