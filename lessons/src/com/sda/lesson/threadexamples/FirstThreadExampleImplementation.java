package com.sda.lesson.threadexamples;

public class FirstThreadExampleImplementation {
    public static void main(String[] args) {

        System.out.println("-------- Thread-i kryesor eshte : " + Thread.currentThread().getName());
     /*   FirstThreadExample firstThreadExample = new FirstThreadExample();
        firstThreadExample.start();
        */
        //Fillimisht krijojme objektin e klases qe ka bere implement Runnable
        RunnableExample firstRunnableExample = new RunnableExample();
        Thread secondThread = new Thread(firstRunnableExample);
        secondThread.start();


        //Menyra ehste me lamda expression
        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread4 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread5 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread thread6 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        thread1.start();
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();



    }
}
