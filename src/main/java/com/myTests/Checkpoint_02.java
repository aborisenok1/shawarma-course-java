package com.myTests;


//Контрольная после модулей «Строки», «Коллекции», «Методы»

import java.util.*;

public class Checkpoint_02 {

    // 1. menuLine
    // 2. orderTotal
    // 3. availableDishes
    // 4. countOrders
    // 5. joinDishes
    // 6. isOnMenu

    // 1. menuLine
    static String menuLine(String dish, int price) {
        String result = dish + " — " + price + " руб";
        return result;
    }

    // 2. orderTotal
    static int orderTotal(List<Integer> prices) {
        int sum = 0;
        for (Integer price : prices) {
            sum = sum + price;
        }
        return sum;
    }

    // 3. availableDishes
    static List<String> availableDishes(List<String> menu, Set<String> soldOut) {

        List<String> available = new ArrayList<>();
        for (String dish : menu) {
            if (soldOut.contains(dish)) {
            } else {
                available.add(dish);
            }
        }
        return available;
    }

    // 4. countOrders
    static Map<String, Integer> countOrders(List<String> orders) {
        Map<String, Integer> result = new HashMap<>();
        for (String dish : orders) {
            result.put(dish, result.getOrDefault(dish, 0) + 1);
        }
        return result;
    }

    // 5. joinDishes
    static String joinDishes(List<String> dishes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dishes.size() - 1; i++) {
            if (dishes.size() > 0) {
                stringBuilder.append(dishes.get(i));
                stringBuilder.append(", ");
            }
        }

        if (dishes.size() > 0) {
            stringBuilder.append(dishes.get(dishes.size() - 1));
            String result = stringBuilder.toString();
            return result;
        }
        return "пусто";
        //return dishes.isEmpty() ? "пусто" : String.join(", ", dishes);
    }

    // 6. isOnMenu
    static boolean isOnMenu(List<String> menu, String dish) {
        for (String s : menu) {
            if (s.toLowerCase().contains(dish)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(menuLine("Шаурма классическая", 250));           // Шаурма классическая — 250 руб
        System.out.println(orderTotal(List.of(250, 90, 250)));                        // 590
        System.out.println(availableDishes(
                List.of("Шаурма", "Фалафель", "Кола"),
                Set.of("Фалафель")));                                                 // [Шаурма, Кола]
        System.out.println(countOrders(List.of("Шаурма", "Кола", "Шаурма")));         // {Шаурма=2, Кола=1}
        System.out.println(joinDishes(List.of()));                                    // пусто
        System.out.println(joinDishes(List.of("Шаурма", "Фалафель", "Кола")));        // Шаурма, Фалафель, Кола
        System.out.println(isOnMenu(List.of("Шаурма", "Кола"), "кола"));         // true
    }
}