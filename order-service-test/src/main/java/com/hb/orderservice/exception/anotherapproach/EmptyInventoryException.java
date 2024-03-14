package com.hb.orderservice.exception.anotherapproach;

import com.hb.orderservice.exception.BusinessExceptions;

public class EmptyInventoryException extends RuntimeException {

    public EmptyInventoryException(String message) {
        super(message);
    }
}
