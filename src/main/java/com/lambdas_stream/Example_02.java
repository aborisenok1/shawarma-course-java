package com.lambdas_stream;

import java.util.List;
import java.util.stream.Collectors;

public class Example_02 {

    public static void main(String[] args) {
        // 1. Подготовка тестовых данных
        List<String> names = List.of("Аня", "Артём", "Вика", "Александр", "Боб");

//        List<Item> items = List.of(
//                new Item("Электроника"),
//                new Item("Книги"),
//                new Item("Электроника"), // Дубликат категории
//                new Item("Одежда")
//        );
//
//        List<Order> orders = List.of(
//                new Order(1L, "PAID"),
//                new Order(2L, "NEW"),
//                new Order(3L, "PAID"),
//                new Order(4L, "DONE")
//        );


        // .toList() - самое частое (Java 16+)
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upper);

//        // .collect(Collectors.toSet()) - уникальные
//        Set<String> unique = items.stream()
//                .map(Item::category)
//                .collect(Collectors.toSet());

        // В строку через разделитель
        String csv = names.stream()
                .filter(n -> n.length() > 3)
                .collect(Collectors.joining(", "));

        // Результат: "Аня, Артём, Вика"
        System.out.println(csv);

    }
}
