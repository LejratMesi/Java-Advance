package com.sda.lesson.one.composition;

public class Room {
    public  TV tv;
    public Bed bed;

    public Room(TV tv,Bed bed) {
        this.bed = bed;
        this.tv = tv;
    }
}
