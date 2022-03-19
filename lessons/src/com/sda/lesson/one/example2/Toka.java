package com.sda.lesson.one.example2;

public class Toka implements World{

    public static Integer NUMBER_OF_CONTINENTS = 7;
    public static Double AREA = 7d;
    public static String FIRST_CONTINENT = "Pangea";

    @Override
    public Integer numriiKontinenteve() {
        return NUMBER_OF_CONTINENTS;
    }

    @Override
    public void printoEmrinEGalaksise() {
        System.out.println("RRuga e qumeshtit");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return FIRST_CONTINENT;
    }

    @Override
    public Double ktheSiperfaqenEUjit() {
        return AREA;
    }
}
