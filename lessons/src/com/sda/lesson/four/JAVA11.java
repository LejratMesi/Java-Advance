
package com.sda.lesson.four;
public class JAVA11 extends Thread {
    private Object lock1;
    private Object lock2;

    public JAVA11(Object l1, Object lock2){
        this.lock1 = l1;
        this.lock2 = lock2;
    }

    @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread-2 acquired lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 interrupted.");
                }
                System.out.println("Thread-2 waiting for lock2");
                synchronized (lock1){
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




