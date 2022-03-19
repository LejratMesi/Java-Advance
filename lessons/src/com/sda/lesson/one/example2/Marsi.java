package com.sda.lesson.one.example2;

public class Marsi implements World{

    @Override
    public Integer numriiKontinenteve() {
        return 5;
    }

    @Override
    public void printoEmrinEGalaksise() {
        System.out.println("Galaksie marsit ");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return "ska kontinente";
    }

    @Override
    public Double ktheSiperfaqenEUjit() {
        return 0d;
    }
}
