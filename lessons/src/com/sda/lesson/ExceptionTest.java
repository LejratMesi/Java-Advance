package com.sda.lesson;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        String serxho = null;
        System.out.println("SER");
        try {
            System.out.println(serxho.length());
        }catch (Exception e ){

        } finally {
            System.out.println("JEMI TEK FINAL");
        }
        System.out.println("SSSSS");
    }
}
