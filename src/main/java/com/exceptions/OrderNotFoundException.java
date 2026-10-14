package com.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(int orderId) {
        super("OrderNotFound with id = " + orderId);
    }
}
