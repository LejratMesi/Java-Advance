package com.sda.ushtrimi_fundit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //package level access
    static List queue = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        Sender sender = new Sender();
        Thread receiver = new Receiver();
        sender.start();
        receiver.start();
    }

    //package-level access
    static boolean available() {
        synchronized(queue) {
            return ! queue.isEmpty();
        }
    }

    static int getNext() {
        synchronized(queue) {
            return (int) queue.remove(0);
        }
    }

    static void enqueue(int next) {
        synchronized(queue) {
            queue.add(next);
        }
    }
}
