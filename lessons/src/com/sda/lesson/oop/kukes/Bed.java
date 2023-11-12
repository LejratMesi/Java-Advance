package com.sda.lesson.oop.kukes;

public class Bed {
    private String name;
    private String bedRoomType;

    public Bed(String name, String bedRoomType){
        this.bedRoomType = bedRoomType;
        this.name = name;
    }


    public String getBedRoomType(){
        return this.bedRoomType;
    }

    public void setBedRoomType(String newBedRoomType){
        this.bedRoomType = newBedRoomType;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
