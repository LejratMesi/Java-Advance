package com.sda.lesson.four;

public class Information extends Thread{

   private SynchronizedExample synchronizedExample;

   public Information(SynchronizedExample synchronizedExample){
       this.synchronizedExample = synchronizedExample;
   }
    @Override
    public void run(){
       try {
           SynchronizedExample.printNubers();
           SynchronizedExample.printoKlasen();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
