package com.strings;

public class FormatExample {
    public static void main(String[] args) {
        int userId = 39;
        int size = 10;
        String sort = "ASC";

        String url = "https://google.com/users/%d/orders?size=%dsort=%s".formatted(userId, size, sort);
        System.out.println(url);

    }
}
