package com.sda.lesson.two;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studenti = new HashMap<>();
        studenti.put("Lejrat", 10);
        studenti.put("Lejrat",4);
        studenti.put("Lejrat1",4);

        for (Map.Entry<String, Integer> pairs : studenti.entrySet()){
            System.out.println(pairs);
        }
    }
}
