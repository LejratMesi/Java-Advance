package com.sda.lesson.genericsAndLambda;

public class Java14ArrayList<T> {
    private Object emptyArray[];
    private Integer DEFAULT_SIZE =10;
    private Integer index = 0;

    public Java14ArrayList(){
        emptyArray = new Object[DEFAULT_SIZE];
    }

    public T merrTekIndeksi(Integer index){
        return (T) emptyArray[index];
    }

    public int madhesia(){
        int count = 0;
        for (int i =0;i< emptyArray.length;i++){
            if(emptyArray[i] == null){
                break;
            } else{
                count++;
            }
        }
        return count;
    }

    public void shto(T value){
        if(index < 10){
            emptyArray[index] = value;
            index++;
        }
    }
}
