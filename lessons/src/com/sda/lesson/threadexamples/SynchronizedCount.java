package com.sda.lesson.threadexamples;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedCount {
    public static int counter = 0;
    public static Lock lock = new ReentrantLock();
    public  static synchronized void incrementCounter(){
        int current = counter;
        System.out.println("Before :" + counter + " Current thread :" + Thread.currentThread().getName());
        counter = current + 1;
        System.out.println("After: " + counter+ " Current thread :" + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        for (int i = 0 ; i< 10; i++){
            Thread t = new Thread(()-> {
                incrementCounter();
            });
            t.start();
        }
    }
}
