package com.sda.lesson.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();
        //Shtimi i nje elementi te nje set
        firstSet.add(1);
        firstSet.add(1);
        firstSet.add(1);
        firstSet.add(1);
        firstSet.add(13);

        //iterate
        for(Integer numer : firstSet){
            System.out.println(numer);
        }
        Set<String> secondSet = new HashSet<>();



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
