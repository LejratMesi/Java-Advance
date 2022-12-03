package com.sda.lesson.threadexamples;

public class Information extends Thread{

   private SynchronizedExample synchronizedExample;

   public Information(SynchronizedExample synchronizedExample){
       this.synchronizedExample = synchronizedExample;
   }
    @Override
    public void run(){
       try {
           synchronizedExample.printNubers();
           SynchronizedExample.printoKlasen();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
