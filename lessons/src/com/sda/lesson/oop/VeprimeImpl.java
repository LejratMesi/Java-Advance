package com.sda.lesson.oop;

public class VeprimeImpl implements Veprime,TestingProcess {
    private int numri1;
    private int numri2;

    public VeprimeImpl(){}



    @Override
    public void printoKlasen() {
        System.out.println("Jemi ne metoden printoKlasen>>>");
    }

    @Override
    public void printoKatin() {
        System.out.println("Jemi ne metoden printoKatin>>>>");
    }

    @Override
    public int lejrat(int numri1, int numri2) {
        return numri1+numri2;
    }

    @Override
    public int shumezimi(int numri1, int numri2) {
        return numri1* numri2;
    }

    public int getNumri1() {
        return numri1;
    }

    public void setNumri1(int numri1) {
        this.numri1 = numri1;
    }

    public int getNumri2() {
        return numri2;
    }

    public void setNumri2(int numri2) {
        this.numri2 = numri2;
    }
}
