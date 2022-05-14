package com.sda.ushtrimi_fundit;

import java.util.Random;

public class Receiver  extends Thread {
    private boolean stop = false;

    public void stopRunning() {
        stop = true;
    }

    @Override
    public void run() {
        while(! stop) {
            while (Main.available()) {
                int next = Main.getNext();
                System.out.println(next) ;
            }
            try {
                synchronized(Main.queue) {
                    Main.queue.notify();
                    Main.queue.wait(10000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}