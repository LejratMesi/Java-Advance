package com.sda.lesson.three;

import java.io.*;

public class ShkodraInputStreamExample {
    public static void main(String[] args) {
      //leximiMeAneTeByte();
      //leximiMeAneTeCharacterStream();
      leximMeRreshta();
    }

    public static void  leximiMeAneTeByte(){
        try {
            //perdoret per te lexuar nga file
            FileInputStream inputStream = new FileInputStream("user.txt");
            //perdoret per te shkruar nga file
            FileOutputStream outputStream = new FileOutputStream("ergys.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println((char)c);
                outputStream.write(c);
            }
            System.out.println("Mbaroi programi");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void leximiMeAneTeCharacterStream(){
        try {
            FileReader reader = new FileReader("words.txt");
            FileWriter writer = new FileWriter("file55.txt");

            int c ;
            while ((c = reader.read()) != -1) {
                System.out.println((char)c);
                writer.write((char) c);
            }
            //perdoret per te shkruar te dhenat qe
            // ne i kemi lexuar tek file qe ne kemi hapur me ane te FileWriter
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leximMeRreshta(){
        try {

            BufferedReader in = new BufferedReader(new FileReader("user.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("user_output1.txt"));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                out.write(line);
                out.newLine();
            }

            out.flush();
            out.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

