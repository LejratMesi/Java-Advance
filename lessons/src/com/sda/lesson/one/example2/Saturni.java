package com.sda.lesson.one.example2;

public class Saturni implements World{


    @Override
    public Integer numriiKontinenteve() {
        return 234;
    }

    @Override
    public void printoEmrinEGalaksise() {
        System.out.println("Galaksia e Saturnit");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return "Saturni";
    }

    @Override
    public Double ktheSiperfaqenEUjit() {
        return 9993.3;
    }
}
