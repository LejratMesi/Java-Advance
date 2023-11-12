package com.sda.lesson.oop.kukes;

import javax.swing.*;

public class MainTest {
    public static void main(String[] args) {
        int vlera = 3;
        String test = new String("tes");
        Protik protik = new Protik(5);
        protik.printoNumerVendesh(); // ka 50 vende
        protik.printoTest(); // TEST
        System.out.println("This is from protik object " + protik.getVendet());
        protik.setVendet(123);
        System.out.println("This is from protik object " + protik.getVendet());

        Plaza plazaKukes = new Plaza();
        plazaKukes.printoNumerVendesh(); // ka 200 vende
        plazaKukes.printoTest(); // TEST

        Protik protikShkoder = new Protik(90);
        protikShkoder.printoNumerVendesh();


       // anonymous class
        Protik protik1 = new Protik(14){
            @Override
            public void printoNumerVendesh() {
                super.printoNumerVendesh();
            }
        };

        protik1.printoNumerVendesh();
    }
}
