package com.sda.lesson.threesubjects.shkoder2;

import java.util.Scanner;

public class ShkodraArrayListImplementation {
    public static void main(String[] args) {
        ShkodraArrayList<Integer> notat = new ShkodraArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni notat e studentave");
        for (int i = 0; i < 6; i++){
            System.out.println("Jep noten :");
            notat.shtoElementa(input.nextInt());
        }


        //Printoj elementat
        for(int i = 0; i< notat.madhesia(); i++){
            System.out.println(notat.merr(i));
        }


        if(notat.permban(3)) {
            System.out.println("Notat e permbajne noten 3");
        } else {
            System.out.println("Notat nuk e permbajne noten 3");
        }
    }
}
