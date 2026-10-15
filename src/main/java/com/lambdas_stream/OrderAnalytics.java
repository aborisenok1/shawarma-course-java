package com.lambdas_stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.lambdas_stream.OrderStatus.*;
import static com.lambdas_stream.PaymentChoice.*;

public class OrderAnalytics {
    public static void main(String[] args) {

        List<OrderRow> orders = List.of(
                new OrderRow(1, "Alice", PAID, CARD, 320),
                new OrderRow(2, "Bob", CREATED, CARD, 420),
                new OrderRow(3, "Robert", PAID, CARD, 520),
                new OrderRow(4, "Alice", PREPARING, CARD, 620),
                new OrderRow(5, "Bob", COMPLETED, CARD, 720),
                new OrderRow(6, "Alice", CANCELLED, CARD, 820),
                new OrderRow(7, "John", READY, CARD, 920),
                new OrderRow(8, "Alice", PAID, CARD, 1020),
                new OrderRow(9, "Marian", CANCELLED, CASH, 1120),
                new OrderRow(10, "Adam", READY, CRYPTO, 1220));

        // 1. Оплаченные заказы клиента
        List<OrderRow> paidOrders = paidByCustomer(orders, "Alice");
        System.out.println("// 1. Оплаченные заказы клиента");
        System.out.println("Список всех оплаченных заказов клиента: " + paidOrders);
        System.out.println();

        // 2. Общая выручка
        System.out.println("// 2. Общая выручка");
        System.out.println("Общая выручка: " + revenue(orders));
        System.out.println();

        //3. Количество заказов по статусам
        System.out.println("//3. Количество заказов по статусам");
        System.out.println(countByStatus(orders));
        System.out.println();

        //4. Выручка по способам оплаты
        System.out.println("//4. Выручка по способам оплаты");
        System.out.println(revenueByPayment(orders));
        System.out.println();

        //5. Пагинация
        Page<OrderRow> pagination = page(orders, 2, 4);
        System.out.println("//5. Пагинация: ");
        System.out.println(pagination.getItems());
        System.out.println();


        OrderAnalytics.paidByCustomer(orders, "Alice")
                .forEach(System.out::println);
        System.out.println(OrderAnalytics.revenue(orders));
        System.out.println(OrderAnalytics.countByStatus(orders));
        System.out.println(OrderAnalytics.revenueByPayment(orders));
        System.out.println(OrderAnalytics.page(orders, 2, 4));
    }


    static List<OrderRow> paidByCustomer(List<OrderRow> orders, String customer) {
        return orders.stream()
                .filter(order -> order.getCustomer().equals(customer) && order.getStatus() == PAID)
                .toList();
    }

    static double revenue(List<OrderRow> orders) {
        return orders.stream()
                .filter(order -> order.getStatus() != CANCELLED)
                .mapToDouble(order -> order.getTotal())
                .sum();
    }

    static Map<OrderStatus, Long> countByStatus(List<OrderRow> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getStatus(),
                        Collectors.counting()
                ));
    }

    static Map<PaymentChoice, Double> revenueByPayment(List<OrderRow> orders) {
        return orders.stream()
                .filter(order -> order.getStatus() != CANCELLED)
                .collect(Collectors.groupingBy(
                        order -> order.getPayment(),
                        Collectors.summingDouble(order -> order.getTotal())
                ));
    }

    static Page<OrderRow> page(List<OrderRow> orders, int pageNum, int pageSize) {
        List<OrderRow> items = orders.stream()
                .skip((long) (pageNum - 1) * pageSize)
                .limit(pageSize)
                .toList();
        return new Page<>(items, pageNum, pageSize, orders.size());
    }
}