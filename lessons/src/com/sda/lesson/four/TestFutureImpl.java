package com.sda.lesson.four;

import java.util.concurrent.*;

public class TestFutureImpl {
    public static void main(String[] args) {
        MultiplayTask task1 = new MultiplayTask(12,12);
        MultiplayTask task2 = new MultiplayTask(10,12);
        MultiplayTask task3 = new MultiplayTask(19,12);
        MultiplayTask task4 = new MultiplayTask(1,12);
        MultiplayTask task5 = new MultiplayTask(0,12);

        ExecutorService executorService = Executors.newFixedThreadPool(10);


        FutureTask<Integer> futureTask1 = new FutureTask<>(task1);
        FutureTask<Integer> futureTask2 = new FutureTask<>(task2);
        FutureTask<Integer> futureTask3 = new FutureTask<>(task3);
        FutureTask<Integer> futureTask4 = new FutureTask<>(task4);
        FutureTask<Integer> futureTask5 = new FutureTask<>(task5);
        futureTask1.run();
        futureTask2.run();
        futureTask3.run();
        futureTask4.run();
        futureTask5.run();
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        try{
            System.out.println(futureTask1.get());
            System.out.println(futureTask2.get());
            System.out.println(futureTask3.get());
            System.out.println(futureTask4.get());
            System.out.println(futureTask5.get());
        } catch (ExecutionException e) {
            System.out.println("Error");  e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
