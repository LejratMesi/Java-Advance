package com.sda.lesson.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArminoExample {
    public static void main(String[] args) {
        Map<String,Integer> studenti = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mbushni map: ");
        for (int i=0;i<=3;i++){
            String name = scanner.next();
            Integer nr= scanner.nextInt();
            studenti.put(name,nr);
        }

        System.out.println("Jep key: ");

        String nr2 = scanner.next();
        if (studenti.containsKey(nr2)){
            System.out.println("EUREKA");
        }
        else System.out.println("Protik");
    }


}
