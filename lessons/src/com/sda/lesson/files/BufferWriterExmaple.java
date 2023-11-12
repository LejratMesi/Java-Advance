package com.sda.lesson.files;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BufferWriterExmaple {
    static String [] differentWords ;
    static String max;
    public static void main(String[] args) {
        try{
            List<String> rreshtat = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("files/informacion.txt"));
            String line = reader.readLine();

            //derisa rreshti qe ne lexojme do jete e ndryshme nga null
            // do runnojme cilklin while
            while(line != null){
                rreshtat.add(line);
                System.out.println("Rreshti " + rreshtat.size()
                        +" tek file informacion eshte :  " + line);
                line = reader.readLine();
            }

            String maxLength = gjejMAxLengthTeArray(rreshtat);
            System.out.println("String me gjatesine me te madhe eshte: ");
            System.out.println(gjejMAxLengthTeArray(rreshtat));
            Words words =  gjejMAxTeFjales(maxLength);

            BufferedWriter out = new BufferedWriter(new FileWriter("files/informacioniKryesor.txt"));
            out.write(maxLength);
            out.newLine();
            out.write(max);
            out.newLine();
            out.write( words.getFjalet().toString());
            out.close();
            FileOutputStream  outputStream = new FileOutputStream("files/informacioniKryesor1.txt");
            ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
            outputStream1.writeObject(words);
            outputStream1.close();
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Words gjejMAxTeFjales(String maxLength) {
        String fjalet[] = maxLength.split(" ");
        max = gjejMAxLengthTeArray(Arrays.asList(fjalet));
        System.out.println("Fjale eshte : " +gjejMAxLengthTeArray(Arrays.asList(fjalet)));
        return gjejFjaletQeMbarojneMeKarakteret(fjalet);
    }

    private static Words gjejFjaletQeMbarojneMeKarakteret(String[] fjalet) {
        List<String> keyWords = new ArrayList<>();

        for(int i = 0 ; i < fjalet.length; i++ ){
            if (fjalet[i].endsWith("a") || fjalet[i].endsWith("r")
                    || fjalet[i].startsWith("S") || fjalet[i].startsWith("d")){
                keyWords.add(fjalet[i]);
            }

        }

        System.out.println("Fjalet qe fillojne\'mbarojne me karakteret qe vendosem");
        for (String s: keyWords) {
            System.out.println(s);
        }
        return new Words(keyWords);

    }

    private static String gjejMAxLengthTeArray(List<String> rreshtat) {
        Integer max = rreshtat.get(0).length();
        int poz = 0;
        for(int i = 1; i < rreshtat.size(); i++){

            if(max < rreshtat.get(i).length()){
                max = rreshtat.get(i).length();
                poz = i;
            }
        }

        return rreshtat.get(poz);
    }
}
