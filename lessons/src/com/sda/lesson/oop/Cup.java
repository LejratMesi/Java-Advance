package com.sda.lesson.oop;

public class Cup<T> {
    private String name;
    private final  T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public Cup(T liquid, String name) {
        this.liquid = liquid;
        this.name = name;
    }
    void drink(){
        System.out.println("drinking " + liquid);
    }

    void print(T object){
        System.out.println(object.toString());
    }
}
