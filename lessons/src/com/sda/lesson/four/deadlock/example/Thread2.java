package com.sda.lesson.four.deadlock.example;

public class Thread2 extends Thread {
    private Object lock1;
    private Object lock2;

    public Thread2(Object lock1, Object lock2){
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("Thread-2 acquired lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread-2 interrupted.");
            }
            System.out.println("Thread-2 waiting for lock2");
            synchronized (lock2){
                System.out.println("Thread-2 acquired lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 interrupted.");
                }
            }
            System.out.println("Thread-2 releases lock2");
        }
        System.out.println("Thread-2 releases lock1");
    }



}
