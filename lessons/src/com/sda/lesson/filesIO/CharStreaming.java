package com.sda.lesson.filesIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.security.spec.ECField;

public class CharStreaming {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("files/string.txt");
            FileWriter fileWriter = new FileWriter("files/hgjfkdls.txt");

            int nextChar = fileReader.read();
            while(nextChar != -1){
                System.out.println(nextChar);
                fileWriter.write(" HELLO " + (char) nextChar);
                nextChar = fileReader.read();
            }

            fileWriter.flush();
            fileWriter.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
