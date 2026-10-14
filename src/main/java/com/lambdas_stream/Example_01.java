package com.lambdas_stream;

import java.util.List;

public class Example_01 {

    record Order(long id, String status, double total) {
    }

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "PAID", 199.99),
                new Order(2, "NEW", 99.99),
                new Order(3, "PAID", 299.99),
                new Order(4, "DONE", 399.99));

        // Только PAID — id выше 100
        List<Long> paidIds = orders.stream()
                .filter(o -> o.status().equals("PAID"))
                .map(Order::id)
                .peek(id -> System.out.println("ID: " + id)) // Вывод перед терминальной функцией
                .toList();
        // [1, 3]
        System.out.println(paidIds);

        System.out.println("---");

        // Сумма всех PAID-заказов
        double total = orders.stream()
                .filter(o -> o.status().equals("PAID"))
                .mapToDouble(Order::total)
                .peek(t -> System.out.println("Total: " + t)) // Вывод перед терминальной функцией
                .sum();
        // 499.98
        System.out.println(total);
    }
}
