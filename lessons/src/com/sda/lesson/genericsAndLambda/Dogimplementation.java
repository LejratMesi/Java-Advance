package com.sda.lesson.genericsAndLambda;

import com.sda.lesson.genericsAndLambda.shkoder2.Printable;

public class Dogimplementation {
    public static void main(String[] args) {
        Printable printable = (s, t) -> System.out.println("HAM " + s + t);
        printoPritable(printable,"Leksi", "TEST");
    }

    public static void printoPritable(Printable printable, String dogName, String test){
        printable.printo(dogName,test);
    }
}
