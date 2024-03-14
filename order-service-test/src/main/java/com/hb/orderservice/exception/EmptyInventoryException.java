package com.hb.orderservice.exception;

public class EmptyInventoryException extends BusinessExceptions{

    public EmptyInventoryException(String message) {
        super(message);
    }
}
