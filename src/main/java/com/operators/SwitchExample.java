package com.operators;

public class SwitchExample {
    public static void main(String[] args) {
        String baseUrl = "";
        String env = "LOCAL";
        baseUrl = switch (env) {
            case "LOCAL" -> "localhost:8080";
            case "PROD" -> "google.com";
            case "STAGE" -> "yandex.ru";
            default -> baseUrl;
        };
        System.out.println(baseUrl);
    }
}
