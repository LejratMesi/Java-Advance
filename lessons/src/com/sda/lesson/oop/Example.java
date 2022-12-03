package com.sda.lesson.oop;

public class Example {
    public static void main(String[] args) {

        ShkoderImpl shkoder = new ShkoderImpl();
        shkoder.print("Shkoder");
        shkoder.printo();
        Shtet shqiperia = new Shtet();
        // ---------- Interfaces-----------
        VeprimeImpl veprime = new VeprimeImpl();
        System.out.println(veprime.shumezimi(1, 2));
        System.out.println(veprime.shumezimi(1, 2));
        veprime.printoKatin();
        veprime.printoKatin();


        //------------Inheritance-------------

        Protik protikTirane = new Protik();
        protikTirane.print();
        protikTirane.printName();

        //_________Kompozimi_____________________
        try {
            Kontinent europa = new Kontinent("Europe", 918273);
            Qytet[] qytete = new Qytet[]{
                new Qytet("Tirane", 8743, true),
                new Qytet("Lezh", 3333, true),
                new Qytet("Lac", 3423423, true),
                new Qytet("Kruje", 34534534, true),
                new Qytet("Lushnje", 123123, true),
                new Qytet("Korce", 4123, true),
                new Qytet("Pogradec", 123, true),
                new Qytet("Durresi", 234234, true),
                new Qytet("Vlora", 293847, true),
                new Qytet("Saranda", 92874, true),
                new Qytet("Elbasan", 324234, true),
                new Qytet("Fier", 21452, true),
                new Qytet("Shkoder", 1111123, true)};

        shqiperia.setKontinenti(null);
        shqiperia.setQyteti(qytete);
        shqiperia.printContinentName();

    } catch (Exception java10){
            System.out.println("Dicka ndodhi " + java10.getMessage());
        } finally {
            shqiperia.maxPopullsia();
            shqiperia.nameThaStartsWithLetterS();
        }


       //Qytet test[] = shqiperia.getQyteti();
        //System.out.println(test[90]);
    }
}
