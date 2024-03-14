package com.hb.orderservice.exception.anotherapproach;

public class BusinessExceptions extends RuntimeException{
    public BusinessExceptions(Exception message) {
        super(message);
    }
}
