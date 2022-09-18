package com.sda.lesson.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        age.add(2);
        age.add(211);
        age.add(22);
        age.add(3);

        System.out.println(age.get(1));

        //Bredhur kemi 2 mundesi

        for(Integer numer : age){
            System.out.println(numer);
        }

        for (int i = 0;i<age.size();i++){
            System.out.println(age.get(i));
        }
        maxList(age);
        isFoundOrNot(2, age);
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Lejrat");
        listOfNames.add("mesi");
        listOfNames.add("mesi");
        listOfNames.add("mesi");
        listOfNames.add("mesi123");

        gjejFjaleMeLengthGreater4(listOfNames);
        gjejFrequency(listOfNames);
    }

    static public void maxList(List<Integer> numra){
        int max = numra.get(0);
        for (int i = 1 ; i < numra.size(); i++){
            if (numra.get(i)>max){
                max = numra.get(i);
            }
        }

        System.out.println("Numri maximal eshte" + max);
    }

    private static void isFoundOrNot (Integer number, List<Integer> listOfInts){
        if (listOfInts.contains(number)){
            System.out.println("U gjet");
        } else {
            System.out.println("nuk u gjet");
        }
    }


    public static void gjejFjaleMeLengthGreater4(List<String> listOfNames){

        for (int i = 0;i < listOfNames.size();i++){
            if(listOfNames.get(i).length() > 4){
                System.out.println(listOfNames.get(i));
            }
        }

    }


    public static void gjejFrequency(List<String> stringList){
        Map<String,Integer> map = new HashMap<>();

        for(String str : stringList){
            if(map.containsKey(str)){
                Integer value = 0;
                value = map.get(str);
                value++;
                map.put(str,value);

            } else{
                map.put(str,1);
            }
        }

        printoHashMap(map);
    }

    private static void printoHashMap(Map<String, Integer> map) {

        for (Map.Entry<String,Integer> pairs : map.entrySet()){
            System.out.println(pairs);
        }
    }

}
