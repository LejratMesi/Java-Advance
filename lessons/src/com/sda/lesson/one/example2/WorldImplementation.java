package com.sda.lesson.one.example2;

public class WorldImplementation {
    public static void main(String[] args) {
        //Shembulli i pare
        // eshte nje klase qe ka bere implementimin e interface
      /*  System.out.println("Te dhena mbi planetin toke");
        Toka toka = new Toka();
        System.out.println(toka.ktheSiperfaqenEUjit());
        System.out.println(toka.numriiKontinenteve());
        toka.printoEmrinEGalaksise();
        System.out.println(toka.merrEmrinEKontinentitTePare());

        System.out.println("Te dhena mbi planetin Mars");
        Marsi marsi = new Marsi();
        System.out.println(marsi.ktheSiperfaqenEUjit());
        System.out.println(marsi.numriiKontinenteve());
        marsi.printoEmrinEGalaksise();
        System.out.println(marsi.merrEmrinEKontinentitTePare());

        System.out.println("Te dhena mbi planetin Saturn");
        Saturni saturni = new Saturni();
        System.out.println(saturni.ktheSiperfaqenEUjit());
        System.out.println(saturni.numriiKontinenteve());
        saturni.printoEmrinEGalaksise();
        System.out.println(saturni.merrEmrinEKontinentitTePare());*/

        //Shembulli 2
        //Polimorfizmi
        System.out.println("Te dhena mbi planetin toke");
        World toka = new Toka();
        System.out.println(toka.ktheSiperfaqenEUjit());
        System.out.println(toka.numriiKontinenteve());
        toka.printoEmrinEGalaksise();
        System.out.println(toka.merrEmrinEKontinentitTePare());

        System.out.println("Te dhena mbi planetin Mars");
        World marsi = new Marsi();
        System.out.println(marsi.ktheSiperfaqenEUjit());
        System.out.println(marsi.numriiKontinenteve());
        marsi.printoEmrinEGalaksise();
        System.out.println(marsi.merrEmrinEKontinentitTePare());

        System.out.println("Te dhena mbi planetin Saturn");
        World saturni = new Saturni();
        System.out.println(saturni.ktheSiperfaqenEUjit());
        System.out.println(saturni.numriiKontinenteve());
        saturni.printoEmrinEGalaksise();
        System.out.println(saturni.merrEmrinEKontinentitTePare());


    }


}
