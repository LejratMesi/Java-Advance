package com.sda.lesson.oop.kukes;

public class Room {
    private Bed bed;
    private TV tv;

    public Room(Bed bed, TV tkukes){
        this.bed = bed;
        this.tv = tkukes;
    }


    public void setBed(Bed newBed){
        this.bed = bed;
    }

    public Bed getBed(){
        return this.bed;
    }


    public void setTv(TV newTv){
        this.tv = newTv;
    }

    public TV getTv(){
        return this.tv;
    }
}
