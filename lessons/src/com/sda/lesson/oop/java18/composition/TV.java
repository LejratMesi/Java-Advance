package com.sda.lesson.oop.java18.composition;

public class TV {
    private String type ;
    private Integer size;

    public TV(String type, Integer size ){
        this.size = size;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
