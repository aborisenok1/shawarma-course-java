package com.myTests;

import java.util.Arrays;

public class Test_04 {
    public static void main(String[] args) {
        long time = System.nanoTime();
        System.out.println(time);

        System.out.println("automation".substring(4, 8));

        System.out.println( Arrays.toString("a,b,,c".split(",")));

        System.out.println('a' + 1);
        System.out.println("a" + 1);
    }
}
