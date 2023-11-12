package com.sda.lesson;

public class TV {
    private String type;
    private int size;

    public TV (String type, int size){
        this.type = type;
        this.size = size;
    }



    public int getSize(){
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type) {
        this.type=type;
    }
}
