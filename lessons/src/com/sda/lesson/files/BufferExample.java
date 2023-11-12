package com.sda.lesson.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferExample {
    public static void main(String[] args) {
        try{
            BufferedReader input = new BufferedReader( new FileReader("files/user.txt"));
            BufferedWriter output = new BufferedWriter( new FileWriter("files/shkoderUser.txt"));

            String line = input.readLine();

            while(line != null){
                System.out.println(line);
                output.write(line);
                output.newLine();
                line = input.readLine();
            }

            output.flush();
            output.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
