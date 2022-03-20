package com.sda.lesson.two;

import java.util.ArrayList;
import java.util.List;

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
    }

    static public void maxList(List<Integer> numra){
        int max = numra.get(0); ;
        for (int i = 1 ; i < numra.size(); i++){
            if (numra.get(i)>max){
                max = numra.get(i);
            }
        }

        System.out.println("Numri maximal eshte" + max);
    }

    private static void isFoundOrNot (Integer number, List<Integer> listOfInts){
        for(int i=0; i<listOfInts.size(); i++){
            if(listOfInts.get(i)==number){
                System.out.println("Number "+number+" exists in the arraylist!");
                break;
            }
            else{
                System.out.println("Number "+number+" does not exist in the arraylist!");
            }
        }
    }


    public static void gjejFjaleMeLengthGreater4(List<String> listOfNames){

        for (int i = 0;i < listOfNames.size();i++){
            if(listOfNames.get(i).length() > 4){
                System.out.println(listOfNames.get(i));
            }
        }

    }

}
