package com.sda;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Exercise32 {
    public static void main(String[] args) {
        File[] myFile = new File("C:\\Users\\mesi\\Pictures\\Pics\\").listFiles();

        for (File x :myFile)
        {
            String fileName = x.getName();
            int indexOfPoint = x.getName().indexOf('.');

            if (x.getName().substring(indexOfPoint,fileName.length()).equals(".jpeg"))
                System.out.println(x.getName());

        }
    }
}
