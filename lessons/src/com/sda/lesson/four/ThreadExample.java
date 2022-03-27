package com.sda.lesson.four;

import javax.sound.sampled.Line;

public class ThreadExample {
    public static void main(String[] args) {

        for(int i = 1;i < 4; i++){
            Information sda = new Information(i);
            Thread newThread = new Thread(sda);
            newThread.start();
        }
       // sda.run();
    }
}
