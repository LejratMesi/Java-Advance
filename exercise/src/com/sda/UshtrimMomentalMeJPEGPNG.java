package com.sda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class UshtrimMomentalMeJPEGPNG {
    public static void main(String[] args) throws IOException {
        File[] myFile = new File("C:\\Users\\mesi\\Downloads").listFiles();

        for (File x : myFile) {
            String fileName = x.getName();
            int indexOfPoint = x.getName().indexOf('.');

            if (!x.getName().substring(indexOfPoint, fileName.length()).equalsIgnoreCase(".jpeg")
                    && !x.getName().substring(indexOfPoint, fileName.length()).equalsIgnoreCase(".png"))

             System.out.println(x.getName()+ Files.size(x.toPath()));


        }
    }
}