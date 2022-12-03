package com.sda.lesson.threadexamples.synchronizeEcamples;


class Thread3 extends Thread{
    Power p;
    Thread3(Power p){
        this.p=p;
    }
    public void run(){
        p.printPower2(8);
    }
}
