package com.sda.lesson.one;

public class CupImpl {
    public static void main(String[] args) {
        Cup<Integer> test = new Cup<>(123456);
        test.print(new Integer(111));
        test.print(new Integer(111));
        test.print(new Integer(111));
        test.print(new Integer(111));
    }
}
