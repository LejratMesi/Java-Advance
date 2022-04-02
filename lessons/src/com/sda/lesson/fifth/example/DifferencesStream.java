package com.sda.lesson.fifth.example;

import java.util.ArrayList;

public class DifferencesStream {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(6);
        nums.add(0, 4);
        // System.out.println("Elementet e arraylistes jane :");
      /* print(nums);
       pirnt1(nums);*/
        gjejNR(nums, 99);
        gjejnr2(nums, 99);
    }

    public static void print(ArrayList<Integer>nums){
        nums.stream().forEach(s -> System.out.print(s + ","));

    }

    public static void pirnt1 (ArrayList<Integer>nums){

        for (int i = 0; i < nums.size(); i++)
        {
            System.out.println("Element is :" + nums.get(i));
        }
    }



    public static void gjejnr2(ArrayList<Integer>num, int numri){
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == numri){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }

    public static void gjejNR(ArrayList<Integer>nums, int numri){

        System.out.println( nums.stream().anyMatch(s -> s==numri));


    }
}