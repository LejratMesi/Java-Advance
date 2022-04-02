package com.sda.lesson.fifth.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frekuenca {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(6);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(10);
        nums.add(10);
        nums.add(0);
        nums.add(7);
        nums.add(1);
        nums.add(1);

        Map<Integer, Integer> firstMap = new HashMap<Integer, Integer>();
        int x=0;

        for (int i = 0; i < nums.size(); i++)
        {
            if(firstMap.containsKey(nums.get(i))){
                int frekuenca = firstMap.get(nums.get(i));
                frekuenca += 1;
                firstMap.put(nums.get(i), frekuenca);
            } else{
                firstMap.put(nums.get(i),0);
            }
        }

        System.out.println(firstMap.entrySet());
    }
}
