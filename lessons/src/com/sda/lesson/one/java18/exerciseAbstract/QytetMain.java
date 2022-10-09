package com.sda.lesson.one.java18.exerciseAbstract;

public class QytetMain {
    public static void main(String[] args) {
        Tirana tirana = new Tirana();
        Durresi durresi = new Durresi();

        //printojme emrat e klasave perkatese
        tirana.printoEmer();
        durresi.printoEmer();

        //printojme metoden merrSiperfaqe
        System.out.println(tirana.merrSiperfaqe());
        System.out.println(durresi.merrSiperfaqe());

    }
}
