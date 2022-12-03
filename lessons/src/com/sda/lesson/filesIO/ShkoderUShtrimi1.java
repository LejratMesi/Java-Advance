package com.sda.lesson.filesIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Ndertoni nje program qe ruajni ne file te dhenat qe merrni nga scanneri
public class ShkoderUShtrimi1 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        FileOutputStream outputStream = new FileOutputStream("files/serxho.txt");

        System.out.println("Shkruani nje fjale");
        outputStream.write(input.nextInt());


    }
}
