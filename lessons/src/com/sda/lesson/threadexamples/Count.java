package com.sda.lesson.threadexamples;

public class Count  /*extends Thread*/{

    private static int counter = 1;
    private static Object lock = new Object();


    public static  void addCounter() throws InterruptedException {
        System.out.println("----- Fillimi-> Emri i thread-it eshte : " + Thread.currentThread().getName() + "-----");
        synchronized (lock) {

            System.out.println("Before :" + counter);
            System.out.println(System.currentTimeMillis());
            Thread.sleep(10000);
            int current = counter;

            counter = current + 1;
            System.out.println("After: " + counter);
            System.out.println(System.currentTimeMillis());
            }
    }


    public static void main(String[] args) {
        for (int i = 0 ; i< 10; i++){
            Thread t = new Thread(()-> {
                try {
                    addCounter();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t.start();

            System.out.println(i);
        }
    }
}
