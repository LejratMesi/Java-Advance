package com.sda.lesson.threadexamples.synchronizeEcamples;


class Thread1 extends Thread{
    Power p;
    Thread1(Power p){
        this.p=p;
    }
    public void run(){
        p.printPower2(5);
    }
}
