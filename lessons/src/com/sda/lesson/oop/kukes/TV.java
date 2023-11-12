package com.sda.lesson.oop.kukes;

public class TV {
    private String type;
    private int size;

    public TV (String type, int size){
        this.type = type;
        this.size = size;
    }


    public String getType(){
        return this.type;
    }

    public void setType(String newType){
        this.type = type;
    }


    public int getSize(){
        return this.size;
    }

    public void setSize(int newSize){
        this.size = newSize;
    }
}
