package com.sda.lesson.collections;

public class GenericTypeExample<T> {

    public GenericTypeExample() {
    }

    public static void main(String[] args) {
       test(1);
       test("Lejrat Mesi");
       test(30D);
       test(30F);
    }

    public static <T> void test (T i){
        System.out.println(i.toString());
    }
}
