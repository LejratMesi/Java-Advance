package com.sda.lesson.one;

public class TEST {
    public static void main(String[] args) {
       try{
           Integer[] arrayWithIntegers = new Integer[]{1,2,3,4};
           bejShumeEArray(arrayWithIntegers);
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("Mbaroi se excetuari");


    }

    private static void bejShumeEArray(Integer[] arrayWithIntegers)  throws ArrayIndexOutOfBoundsException{
        System.out.println("Bej shumen e arrayt ne metode");
        System.out.println(arrayWithIntegers[0]);
        System.out.println(arrayWithIntegers[1]);
        System.out.println(arrayWithIntegers[2]);
        System.out.println(arrayWithIntegers[3]);
        System.out.println(arrayWithIntegers[4]);
    }
}
