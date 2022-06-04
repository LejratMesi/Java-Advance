package com.sda.lesson.four;

public class ThreadExample1 implements Runnable{
    String name;
    Thread t;
    ThreadExample1 (String thread){
        name = thread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        //t.start();
    }


    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(10000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

