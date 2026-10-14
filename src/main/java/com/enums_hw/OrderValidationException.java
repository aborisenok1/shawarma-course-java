package com.enums_hw;

public class OrderValidationException extends RuntimeException {
    public OrderValidationException(String message) {
        super("OrderValidation: " + message);
    }
}