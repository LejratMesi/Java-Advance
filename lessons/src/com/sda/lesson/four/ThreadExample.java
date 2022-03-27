package com.sda.lesson.four;

import javax.sound.sampled.Line;

public class ThreadExample {
    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        for(int i = 1;i <= 10; i++){
            Information sda = new Information(synchronizedExample);
            sda.start();
        }
    }
}
