package com.sda;

import java.util.*;

public class Ushtrimi14_2 {
    public static void main(String[] args) {
        int length = 10;
        int[] numbers = new int[length];
        Random rand = new Random();
        int max = 10;
        int min = 0;
        for (int i = 0; i < length; i++) {
            numbers[i] = rand.nextInt(max - min);
        }

        HashSet<Integer> numbers1 = new HashSet(Collections.singleton(numbers));
        System.out.println("array list elements: ");
        for (Integer element : numbers)
            System.out.println(element);

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int j = 0; j < numbers.length; j++) {
            if (hashmap.containsKey(numbers[j])){
                int val = hashmap.get(numbers[j]);
                val++;

             } else {
                hashmap.put(numbers[j], 0 );
            }
        }

       for(Map.Entry<Integer,Integer> element : hashmap.entrySet()){
           if(element.getValue() > 0){
               System.out.println(element.getKey());
           }
       }
    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());


        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}
