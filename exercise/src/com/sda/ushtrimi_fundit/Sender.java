package com.sda.ushtrimi_fundit;

import java.util.Random;
import java.util.Scanner;

public class Sender extends Thread {
    private boolean stop = false;

    public void stopRunning() {
        stop = true;
    }

    @Override
    public void run() {
        int ran = 1;
        while (ran != 0) {
            System.out.println("Thread from sender : Vendosni nje numer");
                ran = new Scanner(System.in).nextInt() ;
                System.out.println("Threadi i pare " + ran);
                Main.enqueue(ran);

            try {
                synchronized(Main.queue) {
                    Main.queue.wait(10000);
                    Main.queue.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}