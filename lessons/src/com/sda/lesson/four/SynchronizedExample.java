package com.sda.lesson.four;

public class SynchronizedExample {

    public static synchronized void printoKlasen() {
            System.out.println("printoKlasen eshte kerkuar per bllokim " + Thread.currentThread().getName());
        }



    public static synchronized void printNubers (){
        System.out.println(" printNumer method eshte kerkuar per bllokim" +  Thread.currentThread().getName());
    }
}
