package com.sda.lesson.threadexamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService test = Executors.newFixedThreadPool(6);
        test.submit(new SdaShkoderRunnable());
        test.submit(new SdaShkoderRunnable());
        test.submit(new SdaShkoderRunnable());
        test.submit(new SdaShkoderRunnable());

       ExecutorService test1 = Executors.newSingleThreadExecutor();
        test1.submit(new SdaShkoderRunnable());

        ExecutorService test2 = Executors.newSingleThreadExecutor();
        test2.submit(new SdaShkoderRunnable());
    }
}
