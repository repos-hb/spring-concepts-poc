package com.hb.orderservice.controller;

public class InvalidProductIdException extends RuntimeException {
    public InvalidProductIdException(String s) {
        super(s);
    }
}
