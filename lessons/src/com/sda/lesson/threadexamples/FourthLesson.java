package com.sda.lesson.threadexamples;

public class FourthLesson {
    public static void main(String[] args) {
         Object lock1 = new Object();
         Object lock2 = new Object();
         JAVA10 t1 = new JAVA10(lock1,lock2);
         JAVA11 t2 = new JAVA11(lock1,lock2);
         t1.start();
         t2.start();
    }
}
