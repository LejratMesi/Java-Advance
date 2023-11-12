package com.sda.lesson.oop.kukes;

public class Protik extends Salla{

    private int vendet;

    public Protik(int vendet){
        this.vendet = vendet;
    }
    @Override
    public void printoNumerVendesh() {
        System.out.println("Protiku ka "+vendet +" vende");
    }


    public void setVendet(int newVlera){
        this.vendet = newVlera;
    }

    public int getVendet(){
        return this.vendet;
    }
}
