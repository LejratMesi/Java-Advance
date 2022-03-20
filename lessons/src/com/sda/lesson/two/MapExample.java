package com.sda.lesson.two;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studenti = new HashMap<>();
        studenti.put("Ergys", 10);
        studenti.put("Lejrat", 1);
        studenti.put("Mesi", 2);
        studenti.put("Salla", 5);
        studenti.put("Sda", 0);

        for (Map.Entry<String, Integer> pairs : studenti.entrySet()){
            System.out.println(pairs);
        }


    }
}
