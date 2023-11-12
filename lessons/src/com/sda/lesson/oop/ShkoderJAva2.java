package com.sda.lesson.oop;

public class ShkoderJAva2 implements ShkoderInterface {
    @Override
    public void komuniko() {
        System.out.println("komuniko nga metoda me te njejtin emer");
    }

    @Override
    public void komuniko2(String emri) {
        System.out.println("komuniko2 nga metoda me te njejtin " + emri);
    }
}
