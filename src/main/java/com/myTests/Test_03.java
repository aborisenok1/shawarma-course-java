package com.myTests;

public class Test_03 {
    public static void main(String[] args) {
        double pi = 3.14551617;
//        double rounded = Math.round(pi * 100.0) / 100.0;
//        System.out.println(rounded); // 3.15
//
//        double rounded2 = Math.round(pi * 100.0) / 100.0;
//        System.out.println(rounded2);
//
//        String stringConverted = String.format("%.2f", pi);
//        System.out.println(stringConverted);
//
//
//        double truncated = Math.floor(pi * 100) / 100;
//        System.out.println(truncated);
//        String result = String.format("%.2f", truncated); // "3.14"
//        System.out.println(result);
//
//        double convertedBackFromString = Double.parseDouble(result);
//        System.out.println(convertedBackFromString);

        double one = Math.floor(pi * 100.0) / 100.0;
        System.out.println(one);

        double two = Math.round(pi * 100.0) / 100.0;
        System.out.println(two);


        System.out.println(String.format("%05d", 42));
    }
}
