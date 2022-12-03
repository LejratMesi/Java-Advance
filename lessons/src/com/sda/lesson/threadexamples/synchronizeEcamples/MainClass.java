package com.sda.lesson.threadexamples.synchronizeEcamples;

public class MainClass {
    public static void main(String[] args) {
        Power obj = new Power();//only one object
        Thread1 p1=new Thread1(obj);
        Thread3 p2=new Thread3(obj);
        Thread3 p22=new Thread3(obj);
        p1.start();
        p2.start();
        p22.start();
    }
}
