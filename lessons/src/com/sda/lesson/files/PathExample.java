package com.sda.lesson.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("files/data.txt");
            Files.createFile(path);
            Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
            Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
            Files.write(path, "far away....\n".getBytes(), StandardOpenOption.APPEND);

            for (String line : Files.readAllLines(path)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Files.delete(path);
    }
}
