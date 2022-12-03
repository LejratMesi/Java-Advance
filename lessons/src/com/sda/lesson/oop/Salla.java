package com.sda.lesson.oop;

public abstract class Salla {
    public void printoEmer(){
        System.out.println("SAlla");
    }

    public void printProtesta(){
        System.out.println("Protesta");
    }
    public void print(){
        System.out.println("Hello world");
    }


    protected abstract void printName();
}
