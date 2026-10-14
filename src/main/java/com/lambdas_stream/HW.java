package com.lambdas_stream;

import java.util.stream.Stream;

public class HW {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, 4, 5).filter(x -> x % 2 == 1).count());
    }
}
