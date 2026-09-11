package com.collections;

import java.util.*;

public class Theory {
    public static void main(String[] args) {
        List<String> browsers = new ArrayList<>();
        browsers.add("chrome");
        browsers.add("firefox");
        browsers.add("edge");

        int size = browsers.size();
        boolean safari = browsers.contains("safari");
        System.out.println(size);
        System.out.println(safari);
        System.out.println();

        for (String browser : browsers) {
            System.out.println(browser);
        }

        for (int i = 0; i < browsers.size(); i++) {
            String currentBrowser = browsers.get(i);
            System.out.println(currentBrowser);

        }

/*        Map<String, String> cars = new HashMap<>();
        cars.put("KIA", "GREEN");
        cars.put("KIA", "YELLOW");
        cars.put("NISSAN", "BLACK");

        System.out.println(cars.size());
        System.out.println(cars.get("KIA"));

        for (Map.Entry<String, String> stringStringEntry : cars.entrySet()) {
            stringStringEntry.getKey();
            stringStringEntry.getValue();

        }*/

        Set<String> colors = new HashSet<>();
        colors.add("GREEN");
        colors.add("BLACK");
        colors.add("GREEN");

        System.out.println(colors);

        List<String> names = new ArrayList<>();
        Map<String, Integer> ages = new HashMap<>();

    }
}
