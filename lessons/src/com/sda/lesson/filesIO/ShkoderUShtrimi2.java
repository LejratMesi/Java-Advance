package com.sda.lesson.filesIO;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//Shkruani nje applikacion qe ruan ne file fjalet qe jane me te medha se 4 dhe per te ndaluar programin
// perdoruesi do shkruaje QUIT!
//dhe nuk fillon me germen e pare te emrin tuaj
public class ShkoderUShtrimi2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Shkruani nje fjale ju lutem : ");
            String word = input.next();
            BufferedWriter writer = new BufferedWriter(new FileWriter("files/ushtrimi2Shkoder.txt"));

            while (!word.equalsIgnoreCase("quit!")){
                if(findTheSizeOFWordAndWithWatStarts(word)){
                    writer.write(word);
                    writer.newLine();
                }
                System.out.println("Ju lutem shkruani nje fjale ( QUIZ! per te ndaluar programin)");
                word = input.next();
            }

            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("Something went wrong during the application" + e.getCause());
        }

    }

    private static boolean findTheSizeOFWordAndWithWatStarts(String word) {
        if (word.length() > 4 && !word.startsWith("L")){
            return true;
        }
        return false;
    }
}
