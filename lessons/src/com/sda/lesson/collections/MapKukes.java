package com.sda.lesson.collections;

import java.util.HashMap;
import java.util.Map;

public class MapKukes {
    public static void main(String[] args) {
        Map<String,Double> notat  = new HashMap<>();
        //per te vendos ne hashmap
        notat.put("Lerjat", 4.0);
        notat.put("Lerjat", 4.3);
        notat.put("Lerjat1", 4.3);
        notat.put("Lerjat3", 4.3);
        notat.put("Lerjat4", 4.3);
        notat.put("Lerjat5", 4.3);
        notat.put("Lerjat6", 4.3);
        //per te marr vleren
        System.out.println(notat.get("Lerjat"));


        //per te marr te gjith key
        for(String key : notat.keySet()){
            System.out.println(key);
        }


        //per te marr vlerat une kam metoten tjeter
        for(Double value : notat.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, Double> pairs : notat.entrySet()){
            System.out.println(pairs);
            System.out.println(pairs.getKey());
            System.out.println(pairs.getValue());
        }

    }
}
