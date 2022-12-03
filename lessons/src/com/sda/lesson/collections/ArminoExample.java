package com.sda.lesson.collections;

import java.util.*;

public class ArminoExample {
    public static void main(String[] args) {
        denisMethod();
        anisasMethod();
        klenejdasMethod();
        /*Map<String, Integer> studenti = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mbushni map: ");
        for (int i = 0; i <= 3; i++) {
            String name = scanner.next();
            Integer nr = scanner.nextInt();
            studenti.put(name, nr);
        }

        System.out.println("Jep key: ");

        String nr2 = scanner.next();
        if (studenti.containsKey(nr2)) {
            System.out.println("EUREKA");
        } else System.out.println("Protik");*/
    }

    public static void anisasMethod(){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
// Initialize an ArrayList with add()
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(2);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(7);
        arraylist.add(7);
        arraylist.add(7);
        arraylist.add(7);
        arraylist.add(28);
        arraylist.add(9);
        arraylist.add(9);
        arraylist.add(9);
        arraylist.add(9);
        arraylist.add(10);
        arraylist.add(11);
        arraylist.add(13);
        arraylist.add(15);
        arraylist.add(16);
        arraylist.add(16);
        arraylist.add(1626);
        arraylist.add(44);
        arraylist.add(1);
        System.out.println(arraylist.toString());
        Map<Integer,Integer> values = new HashMap<>();
        Integer value;
        int k;
        for (int i=0 ;i<arraylist.size();i++){
            value=arraylist.get(i);
            k=0;
            for (int j=0;j<arraylist.size();j++){
                if(value==arraylist.get(j)) {
                    k++;
                }
            }
            values.put(value,k);
        }
        System.out.println("Map: " +values);

    }


    public static void denisMethod(){
    Map<String, Integer> example = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

        System.out.println("Write the key, press Enter and then write the Value, until it finishes.");
        for(int i = 0; i < 5; i++) {
        String a = scanner.next();
        Integer b = scanner.nextInt();
        example.put(a, b);
    }
        System.out.println("Finished !");

        System.out.println("Write the key to find the value !");
    String input = scanner.next();
        if (example.containsKey(input)){
        System.out.println(example.get(input));
    } else {
        System.out.println("PROTIK !");
    }
}


public  static void klenejdasMethod(){
    List<Integer> list = new ArrayList<>(30);
    list.add(1); list.add(2); list.add(4);
    list.add(1); list.add(3); list.add(5);
    list.add(1); list.add(2); list.add(4);
    list.add(1); list.add(2); list.add(4);
    list.add(1); list.add(1); list.add(4);
    list.add(1); list.add(2); list.add(6);
    list.add(1); list.add(2); list.add(6);
    list.add(1); list.add(2); list.add(9);
    list.add(1); list.add(3); list.add(10);
    list.add(1); list.add(3); list.add(1);
    System.out.println("List elements are " + list);

    Map<Integer,Integer> map = new HashMap<>();
    for (Integer i :list ) {
        if(map.containsKey(i)) {
            int value = map.get(i);
            value += 1;
            map.put(i, value);
        }
        else {
            map.put(i, 0);
        }
    }

    System.out.println(map);
}
}

