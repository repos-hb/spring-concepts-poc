package com.hb.orderservice.controller;

public class OrderNotExistException extends RuntimeException {
    public OrderNotExistException(String s) {
        super((s));
    }
}
