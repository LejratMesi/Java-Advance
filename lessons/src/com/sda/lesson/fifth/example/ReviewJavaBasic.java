package com.sda.lesson.fifth.example;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReviewJavaBasic {
    private static ArrayList<Integer> numberList;

    public static void main(String[] args) {
        pupulateArray();
        System.out.println(findAverage(numberList));
        findMax(null);
    }
    public static void pupulateArray() {
        Scanner scanner = new Scanner(System.in);
        numberList = new ArrayList<>();
        System.out.println("Input number till value 9999");
        int numri = scanner.nextInt();
        while (numri != 9999) {
            numberList.add(numri);
            System.out.println(numberList);
            numri = scanner.nextInt();
        }
    }

    private static Integer findSum(ArrayList<Integer> a)
    {
        Integer sum = 0;
        for(Integer i=0; i<a.size(); i++)
        {
            sum += a.get(i);
        }
        return sum;
    }

    private static Integer findMin(ArrayList<Integer> a)
    {
        Integer min = a.get(0);
        for(Integer i=1; i<a.size(); i++)
        {
            if(min>a.get(i))
            {
                min=a.get(i);
            }
        }
        return min;
    }

    private static Integer findMax(ArrayList<Integer> a)
    {
        Integer max = a.get(0);
        for(Integer i=1; i<a.size(); i++)
        {
            if(max<a.get(i))
            {
                max=a.get(i);
            }
        }
        return max;
    }

    private static Double findAverage(ArrayList<Integer> a)
    {
        Double average = (double) findSum(a) / a.size();
        return average;
    }

    private static Boolean isPresent(Integer number, ArrayList<Integer> a)
    {
        for(Integer elements : a)
        {
            if(elements == number)
            {
                return true;
            }

        }
        return false;
    }

    private static void printOddNumbers(ArrayList<Integer> a){
        for(Integer elements : a)
        {
            if(elements%2 == 1)
            {
                System.out.print(elements + ", ");
            }
        }
    }

    private static Boolean printPrimeNumbers(ArrayList<Integer> a){
        boolean flag = false;
        for(Integer elements : a)
        {
            for(int i = 2; i <= elements/2; ++i)
            {
                if(elements % i == 0)
                {
                    flag = true;
                    break;
                }
                if (!flag)
                    System.out.print(elements + ", ");
            }

        }
        return flag;
    }

    private static void printEvenNumbers(ArrayList<Integer> a){
        for(Integer elements : a)
        {
            if(elements%2 == 0)
            {
                System.out.print(elements + ", ");
            }
        }
    }
}
