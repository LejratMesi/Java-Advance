package com.sda.lesson.threadexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecuteExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Callable<Integer>> callableList = new ArrayList<>();
        callableList.add(() -> 1);
        callableList.add(() -> 2);
        try {
            System.out.println(executorService.invokeAll(callableList));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
