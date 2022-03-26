package com.sda.lesson.three;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("user.txt");
        FileOutputStream outputStream = new FileOutputStream("user_1.txt");
        int next = 0;
        byte[] test = new byte[20];
        next = inputStream.read(test,0,20);
        while(next != -1){
            System.out.println((char) next);
            System.out.println(test[2]);
            outputStream.write(next);
            next= inputStream.read();
        }
    }

}
