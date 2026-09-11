package com.myTests;


//
//Даны три неубывающих массива чисел. Нужно найти число, которое присутствует во всех трёх массивах:
//        [1,2,3,4,5], [3,3,4], [2,3,4,5,6]
//Язык Java
//


public class Test_01 {
    public static void main(String[] args) {
        int[] massive1 = new int[]{1, 2, 3, 4, 5};
        int[] massive2 = new int[]{3, 3, 4};
        int[] massive3 = new int[]{2, 3, 4, 5, 6};


        for (int i = 0; i < massive1.length; i++) {
            for (int j = 0; j < massive2.length; j++) {
                for (int k = 0; k < massive3.length; k++) {
                    if (massive1[i] == massive2[j] && massive2[j] == massive3[k]) {
                        System.out.println(massive1[i]);
                    }
                }
            }
        }
    }
}
