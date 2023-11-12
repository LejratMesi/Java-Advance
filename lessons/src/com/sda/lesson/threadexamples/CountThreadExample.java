package com.sda.lesson.threadexamples;

import com.sda.lesson.threadexamples.Count;

public class CountThreadExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0 ; i< 10; i++){
            Count thread = new Count();
            thread.addCounter();
        }

        /*
        *  i =0;
        *
        *
        *
        * */
    }
}
