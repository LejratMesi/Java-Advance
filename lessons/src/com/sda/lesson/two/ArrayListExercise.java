package com.sda.lesson.two;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String [] args) {
        List<String> names = new ArrayList<>();
        populloArrayList(names);
        replaceSecondElement(names);

    }

    private static void populloArrayList(List<String> names) {
        names.add("Elvis");
        names.add("Eltion");
        names.add("Lejrat");
        names.add("Hygerta");
        names.add("Rais");
        names.add("Albino");
    }

    public static void replaceSecondElement(List<String> names){
        names.set(2, "Profesori");
        printAllElements(names);
    }
    public static void printAllElements(List<String> names){
        for (int i=0;i< names.size();i++)
            System.out.println(names.get(i));
    }
}
