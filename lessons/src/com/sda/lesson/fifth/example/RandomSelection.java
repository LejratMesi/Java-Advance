package com.sda.lesson.fifth.example;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelection {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(6);
        nums.add(0, 4);
        System.out.println("Elementet e arraylistes jane :");
        nums.stream().forEach(s -> System.out.print(s + ","));
        int i = new Random().nextInt(nums.size() - 1);
        System.out.println("\ni eshte " + i);
        int test = i;
        while (true) {
            System.out.println(nums.get(i));

            if (i >= nums.size() - 1) {
                i = 0;
            } else {
                i++;
            }

            if (test == i) {
                break;
            }
        }
    }
}

