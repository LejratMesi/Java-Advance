package com.sda.lesson.oop;

public class Author<T> {
    public T emri;
    public void setEmri(T emri){
        this.emri = emri;
    }
    public T getEmri(){
        return emri;
    }

}
