package com.sda.lesson.threadexamples;
//Menyra e dyte eshte qe ti bejme implements interfac-it Runnable
public class RunnableExample  implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
