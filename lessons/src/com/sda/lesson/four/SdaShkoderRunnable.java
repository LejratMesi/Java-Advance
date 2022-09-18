package com.sda.lesson.four;

public class SdaShkoderRunnable implements Runnable{

    @Override
    public void run() {
        try {
            printo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printo() throws InterruptedException {
        for (int i =0;i<6;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }


}
