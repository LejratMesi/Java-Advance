package com.sda.lesson;

import com.sun.source.tree.BreakTree;

public class Author<T> {
    public T emri;
    public void setEmri(T emri){
        this.emri = emri;
    }
    public T getEmri(){
        return emri;
    }

}
