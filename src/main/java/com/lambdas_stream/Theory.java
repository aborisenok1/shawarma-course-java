package com.lambdas_stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Theory {
    public static void main(String[] args) {
        Predicate<String> isLong = x -> x.length() > 5;
        System.out.println(isLong.test("Hi"));
        System.out.println(isLong.test("Arigato Gusianmas"));

        Function<String, Integer> length = x -> x.length();
        System.out.println(length.apply("Hello"));

        List<String> pizzas = List.of("Margarita", "Pepperoni", "Hawaii", "Carbonara");

        List<String> moreThan7 = pizzas.stream()
                .filter(x -> x.length() > 7)
                .toList();

        System.out.println(moreThan7);

        List<Integer> list = pizzas.stream()
                .map(x -> x.length())
                .toList();

        System.out.println(list);

        Optional<String> h = pizzas.stream()
                .filter(x -> x.startsWith("O"))
                .findAny();

        System.out.println(h);

//        if (h.isEmpty()){
//            //System.out.println("Нет значения, возьми другое!");
//            String s = h.orElseGet(() -> "Ovsianaya pizza");
//            h.orElseThrow(()-> new OrderNotFoundException(1));
//            System.out.println(s);
//        }

        //System.out.println(h.get());

        List<Order> orders = List.of(
                new Order(1L, "CREATED", 150.0, "Alice"),
                new Order(2L, "PAID", 320.99, "Bob"),
                new Order(3L, "CANCELLED", 89.76, "Alice"),
                new Order(4L, "PAID", 210.00, "Charlie"),
                new Order(5L, "PAID", 540.90, "Bob")
        );

        List<Order> paid = orders.stream()
                .filter(x -> x.getStatus().equals("PAID"))
                .toList();

        System.out.println(paid);

        List<String> cancelled = orders.stream()
                .filter(x -> x.getStatus().equals("CANCELLED"))
                .map(x -> x.getCustomer())
                .toList();

        System.out.println(cancelled);

    }
}
