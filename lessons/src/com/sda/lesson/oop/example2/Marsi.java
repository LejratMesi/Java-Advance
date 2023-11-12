package com.sda.lesson.oop.example2;

public class Marsi implements World{

    @Override
    public Integer numriiKontinenteve() {
        return 5;
    }

    @Override
    public void printoEmrinEGalaksise() {
        System.out.println("Rruga e Qumeshtit");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return "Saranda";
    }

    @Override
    public Double ktheSiperfaqenEUjit() {
        return 328934.9;
    }
}
