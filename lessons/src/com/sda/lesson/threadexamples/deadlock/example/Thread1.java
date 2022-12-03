package com.sda.lesson.threadexamples.deadlock.example;

public class Thread1 extends Thread {
    private Object lock1;
    private Object lock2;

    public Thread1(Object lock1, Object lock2){
        this.lock1 = lock1;
        this.lock2 = lock2;
    }


    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("Thread-1 acquired lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread-1 interrupted.");
            }
            System.out.println("Thread-1 waiting for lock2");
            synchronized (lock2) {
                System.out.println("Thread-1 acquired lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread-1 interrupted.");
                }
            }
            System.out.println("Thread-1 releases lock2");
        }
        System.out.println("Thread-1 releases lock1");
    }
}
