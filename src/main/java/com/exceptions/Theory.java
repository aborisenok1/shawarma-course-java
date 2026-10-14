package com.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Theory {
    public static void main(String[] args) {
        //findOrderStatus(1000);
        System.out.println(findOrderStatus(50));


        try {
            String content = readContentFromFile("src/main/resources/file.txt");
            System.out.println(content);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            System.out.println();
            System.out.println("Код внутри finally");
        }
        System.out.println("Мы прошли try catch finally");
    }

    public static String findOrderStatus(int orderId) {
        if (orderId <= 0) {
            throw new IllegalArgumentException("orderId must be positive");
        }

        if (orderId == 1000) {
            throw new OrderNotFoundException(orderId);
        }

        return "PAID";
    }

    public static String readContentFromFile(String path) throws IOException {
        return Files.readString(Path.of(path));
    }
}
