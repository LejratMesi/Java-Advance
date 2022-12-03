package com.sda.lesson.threesubjects.example;

import java.util.ArrayList;

public interface ReviewJavaBasicInterface {
    void pupulateArray();

    Integer findSum(ArrayList<Integer> a);

    Integer findMin(ArrayList<Integer> a);

    Integer findMax(ArrayList<Integer> a);

    Double findAverage(ArrayList<Integer> a);

    Boolean isPresent(Integer number, ArrayList<Integer> a);

    void printOddNumbers(ArrayList<Integer> a);

    Boolean printPrimeNumbers(ArrayList<Integer> a);

    void printEvenNumbers(ArrayList<Integer> a);
}
