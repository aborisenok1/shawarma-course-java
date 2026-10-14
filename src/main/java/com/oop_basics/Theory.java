package com.oop_basics;

public class Theory {
    public static void main(String[] args) {

        OrderResponse orderResponse = new OrderResponse();
//        orderResponse.setId(2);
//        orderResponse.setStatus("NEW");
//        orderResponse.setPrice(60);
//        orderResponse.setReceptId(19);
        System.out.println(orderResponse);
        System.out.println(orderResponse.getId());

        OrderResponse orderResponse2 = new OrderResponse(5, "DONE", 99.99, 10);
        System.out.println(orderResponse2.getId());

        orderResponse.summary();
        orderResponse2.summary();

        orderResponse.addDiscount(30);
    }
}
