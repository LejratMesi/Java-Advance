package com.sda.lesson.threadexamples;


//Menyra e pare per te krijuar nje thread eshte qe ti besh extends klases Thread
public class FirstThreadExample  extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
