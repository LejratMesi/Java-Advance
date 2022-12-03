package com.sda.lesson.threadexamples;

public class ThreadExampleShkoderAl1 {
    public static void main(String[] args) {
        //Krijimi i nje thread-i
        SDaShkoder thread1 = new SDaShkoder();
        //therrasim metoden start() per ta startuar threadin
        thread1.start();
      //  SDaShkoder thread2 = new SDaShkoder();
        // ne momentin qe ne therrasim metoden run direkt ne atehere kemi therritur nje metode the objektit
        // dhe nuk e kemi startuar thread - in
        //thread2.start();

       // SDaShkoder thread3 = new SDaShkoder();
        // ne momentin qe ne therrasim metoden run direkt ne atehere kemi therritur nje metode the objektit
        // dhe nuk e kemi startuar thread - in
       // thread3.start();


        //NE momentin qe ne duam te krijojme nje therad me ane te nje klase qe ka implements interfacin
        // RUNNABLE anteher ene krijojme nje objekt te asaj klase
        SdaShkoderRunnable sdaShkoderRunnable = new SdaShkoderRunnable();
        //Krijojme nje thread qe ka si parameter klasen qe ka implements interface (sdaShkoderRunnable)
        Thread thread = new Thread(sdaShkoderRunnable);
        //Startojme threadin duke therritur metoden start te klases thread
        thread.start();
    }
}
