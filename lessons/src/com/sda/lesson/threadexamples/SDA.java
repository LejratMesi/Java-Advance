package com.sda.lesson.threadexamples;

public class SDA {
    public static void printo() {
        synchronized (SDA.class) {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
