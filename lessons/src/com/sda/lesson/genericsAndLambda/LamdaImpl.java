package com.sda.lesson.genericsAndLambda;

public class LamdaImpl {

    public static void main(String[] args) {
       new Thread(() -> System.out.println("Protik") ).start();
        LambdaExample s = () -> System.out.println("Lerjat");
        s.printLocation();
    }
}
