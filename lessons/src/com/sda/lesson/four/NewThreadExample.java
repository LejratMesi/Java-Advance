package com.sda.lesson.four;

public class NewThreadExample extends Thread{

    @Override
    public void run (){
        System.out.println(" Printimi nga "+ Thread.currentThread().getName()+" :)");
    }

}
