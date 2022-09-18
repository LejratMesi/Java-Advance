package com.sda.lesson.four.synchronizeEcamples;

public class Thread4 extends Thread {
    public void run(){
        synchronized (this){
            for (int i = 0; i< 5; i++){
                System.out.println(Thread.currentThread().getName() + " i eshte e barabarte me :" + i);
            }
        }
    }
}
