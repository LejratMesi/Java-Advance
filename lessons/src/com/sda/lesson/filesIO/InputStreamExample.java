package com.sda.lesson.filesIO;

import java.io.*;

//Byte streamin
public class InputStreamExample {

    public static void main(String[] args) throws IOException {
        try (InputStream input = new FileInputStream("files/img.png");
             OutputStream output = new FileOutputStream("files/output.jpg")) {

            byte[] buffer = new byte[1024]; // Përdorim një buffer 1 KB për të lexuar/shkruar

            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
