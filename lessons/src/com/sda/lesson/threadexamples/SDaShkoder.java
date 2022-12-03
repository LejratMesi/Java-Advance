package com.sda.lesson.threadexamples;

public class SDaShkoder extends Thread {

    public  synchronized void printo(){

        try {
            for (int i =0;i<6;i++){
                System.out.println(Thread.currentThread().getName());
                notify();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {
        printo();
    }
}
