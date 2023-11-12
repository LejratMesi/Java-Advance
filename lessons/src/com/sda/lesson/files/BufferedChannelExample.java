package com.sda.lesson.files;

import java.nio.CharBuffer;
import java.util.Arrays;

public class BufferedChannelExample {
    public static void main(String[] args)
    {
        CharBuffer buffer = CharBuffer.allocate(8);

        String text = "sdaa123";
        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }
        System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));
    }
}
