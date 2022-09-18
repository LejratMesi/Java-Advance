package com.sda.lesson.four.synchronizeEcamples;

class Power{
    synchronized void printPower(int n){//method synchronized
        int temp = 1;
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
            temp = n*temp;
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
        }
    }

    void printPower2(int n ){
        System.out.println( Thread.currentThread().getName() + "PO fillon synchronized");
        synchronized(this){ //synchronized block
            int temp = 1;
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
                temp = n*temp;
                try{
                    Thread.sleep(500);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }
}
