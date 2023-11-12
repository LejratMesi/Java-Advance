package com.sda.lesson.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Ndertoni nje program qe ruajni ne file te dhenat qe merrni nga scanneri
public class ShkoderUShtrimi1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ju lutem jepni emrin e file: ");
            String emriFile = sc.nextLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/"+emriFile));

            System.out.println("Ju lutem shkruani tekstin ne file (Mbarova per te perfunduar): ");
            String teksti;

            while (!(teksti = sc.nextLine()).equalsIgnoreCase("Mbarova")) {
                bufferedWriter.write(teksti);
                bufferedWriter.newLine();
            }

            System.out.println("Te dhenat u ruajten me sukses ne file.");
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Gabim gjate shkruarjes ne file: " + e.getMessage());
        }
    }
}
