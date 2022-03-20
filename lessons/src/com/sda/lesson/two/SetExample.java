package com.sda.lesson.two;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> names = new HashSet<>();
        names.add(new Integer(1));
        names.add(new Integer(1));
        names.add(new Integer(1));
        names.add(new Integer(1));
        Iterator<Integer> test = names.iterator();
        while(test.hasNext()){
            System.out.println(test.next());
        }
        ushtrimiKlases();

    }

    public static void ushtrimiKlases(){
        Scanner in = new Scanner(System.in);
        Set<String> name = new HashSet<>();
        System.out.println("Vendos numrin e vlerave qe do vendosesh");
        int arrsize = in.nextInt();

        for(int i = 0 ; i <arrsize ; i++ ){
            System.out.println("Vendos el "+ (i+1) + " te listes");
            name.add(in.next());
        }
        System.out.println("Vendos stringun qe do te kontrollosh");
        String checkName = in.next();
        if (name.contains(checkName)){
            System.out.println("Stringu ekziston");
        }
        else System.out.println("Stringu nuk ekziston");

    }
}
