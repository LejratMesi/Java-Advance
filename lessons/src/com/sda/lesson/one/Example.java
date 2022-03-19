package com.sda.lesson.one;

public class Example {
    public static void main(String[] args) {
        VeprimeImpl veprime = new VeprimeImpl(3,4);
        System.out.println(veprime.shumezimi(1,2));
        System.out.println(veprime.shuma(1,2));
        veprime.printoKatin();
        veprime.printoKlasen();
    }
}
