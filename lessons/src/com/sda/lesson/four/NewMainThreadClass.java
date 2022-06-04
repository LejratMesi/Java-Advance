package com.sda.lesson.four;

public class NewMainThreadClass {
    public static void main(String[] args) {
        NewThreadExample newThreadExample = new NewThreadExample();
        newThreadExample.start();
        //newThreadExample.start();
        ThreadExample1 test1 = new ThreadExample1("One");
        ThreadExample1 test2 = new ThreadExample1("One");
        ThreadExample1 test3 = new ThreadExample1("One");
        ThreadExample1 test4 = new ThreadExample1("One");
        ThreadExample1 test5 = new ThreadExample1("One");
        /*Thread test = new Thread(test1);
        test.start();*/
    }
}
