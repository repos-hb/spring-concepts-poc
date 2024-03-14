package com.hb.orderservice.exception.anotherapproach;

import com.hb.orderservice.exception.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessExceptionsHandlerV2 {

    @ExceptionHandler
    public com.hb.orderservice.exception.ErrorResponseDto handleBusinessExceptions(BusinessExceptions ex){
        return ErrorResponseDto.builder()
                .status("FAILED")
                .errorMessage(ex.getCause().getMessage())
                .statusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
                .type(ex.getClass().getSimpleName())
                .build();
    }
}
