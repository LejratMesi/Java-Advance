package com.sda.lesson.one;

public class Cup<T> {
    private final  T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }
    void drink(){
        System.out.println("drinking " + liquid);
    }

    void print(T object){
        System.out.println(object.toString());
    }
}
