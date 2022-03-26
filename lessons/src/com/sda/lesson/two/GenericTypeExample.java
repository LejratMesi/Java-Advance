package com.sda.lesson.two;

public class GenericTypeExample<T> {

    public GenericTypeExample() {
    }

    public static void main(String[] args) {
       test(new Integer(1));
       test("Lejrat Mesi");
       test(30D);
       test(30F);
    }

    public static <T> void test (T i){
        System.out.println(i.toString());
    }
}
