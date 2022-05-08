package com.sda;

import java.util.Random;
import java.util.Scanner;

public class Ushtrimet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String endWord = "grupi_1";

        while (!endWord.equals("end")){
            System.out.println(endWord + " ka ushtrimin " +( new Random().nextInt(7)+5));
            endWord = input.next();
        }
    }
}
