package com.sda.lesson.one;

public class Example {
    public static void main(String[] args) {
        VeprimeImpl veprime = new VeprimeImpl();
        System.out.println(veprime.shumezimi(1,2));
        System.out.println(veprime.shumezimi(1,2));
        veprime.printoKatin();
        veprime.printoKatin();



        //-------------------------

        Protik protikTirane = new Protik();
        protikTirane.print();
        protikTirane.printName();

        //______________________________
        Kontinent europa = new Kontinent("Europe",918273);
        Qytet tirana = new Qytet("Tirane", 8743, true);
        Shtet shqiperia = new Shtet(europa,tirana);
    }
}
