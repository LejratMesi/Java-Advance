package com.sda.lesson.collections.java17Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Java14Lamda {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> studentsNames = Arrays.asList(new String[]{"SAmi Frasheri","SAmi Frasheri", "SAmi Frasheri", "Protik", "SDA",
                "JAva14", "JAva14", "JAva14","JAva14", "JAva14", "JAva14"});
        //populloListen(input, studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 1");
        printoNames(studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 2 ");
        gjejFjalenMeTeGjate(studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 3");
        gjejFjalenMeTeShkurter(studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 4");
        fjalaQePerseritet(studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 5, 6");
        ktheFjale(studentsNames);



    }

    private static void gjejFjalenMeTeGjate(List<String> studentsNames) {
        System.out.println(studentsNames.stream().max(Comparator.comparing(String::length)).get());
    }






    public static void gjejFjalenMeTeShkurter(List<String> studentsNames) {
        System.out.println(studentsNames.stream().min(Comparator.comparing(String::length)).get());

    }

    //popullim e arraylistes nepermjet perdoruesit;
    public static List<String> populloListen(Scanner input3, List<String> names){
        System.out.println("Jep numrin e studentave keni per te ruajtur");
        Integer numriStudentave = input3.nextInt();

        for (int i = 0; i < numriStudentave; i++){
            System.out.println("Jep emrin e studentit " + (i + 1)  + " :");
            names.add(input3.next());
        }

        return names;
    }

    //printimi i studentave
    public  static void printoNames(List<String> studentsNames){
        studentsNames.stream().forEach(s -> System.out.println(s));
    }


    public static void fjalaQePerseritet(List<String> studentNames){
        System.out.println(studentNames.stream().collect(Collectors.toConcurrentMap(w->w, v->1,Integer::sum)));
    }

    public static void ktheFjale(List<String> studentsNames){
        AtomicInteger i = new AtomicInteger(0);
        studentsNames.forEach(studentName -> {
            if (i.get() % 2 == 0){
                System.out.println(studentName.toLowerCase());
            } else {
                System.out.println(studentName.toUpperCase());
            }
            i.getAndIncrement();
        });
    }

}
