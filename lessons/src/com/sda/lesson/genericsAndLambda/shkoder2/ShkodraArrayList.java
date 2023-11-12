package com.sda.lesson.genericsAndLambda.shkoder2;

import java.util.ArrayList;

public class ShkodraArrayList <T extends Number> {

    private ArrayList<T> arrayList;


    //Construktori
    //Konstruktori sherben per te inicializuar objektin e klases dhe ne rastin tone per ti dhene nje vlere variablit arrayList
    public ShkodraArrayList() {
        arrayList = new ArrayList<>();
    }

    public void shtoElementa(T element){
        arrayList.add(element);
    }

    public int madhesia(){
        return arrayList.size();
    }

    public void fshiElementin(int index){
        arrayList.remove(index);
    }

    public boolean permban(T vleraEDeshiruar){
        return arrayList.contains(vleraEDeshiruar);
    }


    public T merr(int index){
        return arrayList.get(index);
    }
}
