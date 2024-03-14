package com.hb.orderservice.exception.anotherapproach;

import com.hb.orderservice.exception.BusinessExceptions;

public class ProductNotAvailableException extends RuntimeException {
    public ProductNotAvailableException(String message) {
        super(message);
    }
}
