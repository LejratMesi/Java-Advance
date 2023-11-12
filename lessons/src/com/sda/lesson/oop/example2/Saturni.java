package com.sda.lesson.oop.example2;

public class Saturni implements World{

    @Override
    public Integer numriiKontinenteve() {
        return 9;
    }

    @Override
    public void printoEmrinEGalaksise() {
        System.out.println("Tirana");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return "Shqiperia";
    }

    @Override
    public Double ktheSiperfaqenEUjit() {
        return 90.0;
    }
}


