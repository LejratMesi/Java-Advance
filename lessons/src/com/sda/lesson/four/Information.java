package com.sda.lesson.four;

public class Information implements Runnable{

    private Integer numberOfThread;

    public Information(Integer numberOfThread){
        this.numberOfThread = numberOfThread;
    }

    @Override
    public void run(){

        for (int i = 1; i < 5;i++){
            System.out.println("JAVA" + i + " prinuar nga threadi me numer" + numberOfThread);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
