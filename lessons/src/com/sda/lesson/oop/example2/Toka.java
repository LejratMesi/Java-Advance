package com.sda.lesson.oop.example2;

public class Toka implements World{

    @Override
    public Integer numriiKontinenteve() {
        return 90;
    }

    @Override
    public void printoEmrinEGalaksise() {
        System.out.println("KUKES");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return "Kukes";
    }

    @Override
    public Double ktheSiperfaqenEUjit() {
        return 0.0;
    }
}

