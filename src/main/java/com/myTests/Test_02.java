package com.myTests;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Test_02 {


    /**
     * Находит все уникальные числа, присутствующие в каждом из трёх неубывающих массивов.
     * Возвращает список этих чисел в порядке возрастания.
     *
     * @param a первый неубывающий массив
     * @param b второй неубывающий массив
     * @param c третий неубывающий массив
     * @return список общих элементов (уникальных)
     */
    public static List<Integer> findCommon(int[] a, int[] b, int[] c) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            int ai = a[i];
            int bj = b[j];
            int ck = c[k];

            if (ai == bj && bj == ck) {
                // добавляем число, если оно ещё не было добавлено (избегаем дубликатов)
                if (result.isEmpty() || result.get(result.size() - 1) != ai) {
                    result.add(ai);
                }
                // сдвигаем все указатели, чтобы перейти к следующим элементам
                i++;
                j++;
                k++;
            } else {
                // сдвигаем указатель с наименьшим текущим значением
                int min = Math.min(ai, Math.min(bj, ck));
                if (ai == min) i++;
                if (bj == min) j++;
                if (ck == min) k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 3, 4};
        int[] c = {2, 3, 4, 5, 6};

        List<Integer> common = findCommon(a, b, c);
        System.out.println("Общие числа: " + common); // [3, 4]

        // Дополнительный тест с повторяющимися значениями
        int[] a2 = {1, 1, 2, 3, 3};
        int[] b2 = {1, 3, 3, 4};
        int[] c2 = {1, 1, 3, 5};
        System.out.println("Общие числа: " + findCommon(a2, b2, c2)); // [1, 3]

        // Тест с пустыми массивами
        int[] empty = {};
        System.out.println("Общие числа: " + findCommon(a, empty, c)); // []
    }
}

