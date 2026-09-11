package com.methods;

public class Theory {
    public static void main(String[] args) {
        String message = "вызов из мэйна";
        logStep(message);
    }

    public static void logStep(String message) {
        System.out.println("Логируем шаг: " + message);
    }
}