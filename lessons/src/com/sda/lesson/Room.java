package com.sda.lesson;

public class Room {
    private Bed bed;
    private TV tv;

    public Room(Bed bed, TV tv){
        this.bed = bed;
        this.tv = tv;
    }


    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
