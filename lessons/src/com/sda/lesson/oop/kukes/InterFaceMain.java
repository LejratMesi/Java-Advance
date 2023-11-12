package com.sda.lesson.oop.kukes;

public class InterFaceMain {
    public static void main(String[] args) {
        FirstInterface kukes = new Kukes();
        FirstInterface shkodra = new Shkodra();

        //FirstInterface test = new Protik(123);
        kukes.eshteNumriTekApoCift(12);
        shkodra.eshteNumriTekApoCift(12);
    }
}
