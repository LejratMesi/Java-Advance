package com.sda.lesson.threesubjects.shkoder2;



public class GenericClassExample <T> {

    private T object;

    public GenericClassExample (T firstParameter){
        object = firstParameter;
    }

    public void printo(){
        System.out.println(object);
    }

}
