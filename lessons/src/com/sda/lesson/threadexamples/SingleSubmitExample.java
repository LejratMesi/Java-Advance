package com.sda.lesson.threadexamples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleSubmitExample {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static Future<Double> getRandom(int a){
        return executorService.submit(() -> {
            System.out.println(a);

            return Math.random();
        });
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Double> test = getRandom(1);
        getRandom(3);
        getRandom(4);
        getRandom(5);
        while(!test.isDone()){
            if(test.isCancelled()){
                System.out.println("Your future was cancelled, we are sorry");
                break;
            } else{
                Thread.sleep(500);
            }
        }

        System.out.println(test.get());
        executorService.shutdown();
    }
}
