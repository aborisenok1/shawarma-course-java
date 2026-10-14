package com.enums;

public class Theory {
    public static void main(String[] args) {
        OrderStatus orderStatus = OrderStatus.PAID;

        if (orderStatus == OrderStatus.PAID) {
            System.out.println("Заказ оплачен");
        }

        OrderStatus s = OrderStatus.PREPARING;
        String hint = switch (s) {
            case CREATED, AWAITING_PAYMENT -> "ждём оплату";
            case PAID, PREPARING -> "готовим";
            case READY, COMPLETED -> "можно выдавать";
            case CANCELLED -> "отменен";
        };

        System.out.println(hint);

        PaymentChoice crypto = PaymentChoice.CRYPTO;
        System.out.println(crypto.getProvider());
    }
}
