package com.sda.lesson.java17Collections;

    // Ushtrim:
    // Ruaji te dhenat qe jepen nga perdoruesi dhe me pas beni keto kerkesa:
    // Printo te dhenat e perdoruesit
    // Gjej fjalen me te gjate tek arrayList
    // Gjej fjalen me te shkurter tek arraylist
    // Gjej frequencen
    // Ktheni fjalet ne poz tek me germa te medha
    // Ktheni fjalet ne poz cift me germa te vogla.

import java.util.*;

public class ClassExercise {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> studentsNames = new ArrayList<>();
        populloListen(input, studentsNames);
        /*System.out.println("--------------------");
        System.out.println("Kerkesa e 2");
        printoNames(studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 3");
        gjejFjalenMeTeGjate(studentsNames);
        System.out.println("--------------------");
        System.out.println("Kerkesa e 4");
        gjejFjalenMeTeShkurter(studentsNames);
        System.out.println("--------------------");*/
        System.out.println("Kerkesa e 4");
        countTimesOfRepeat(studentsNames);
      /*  System.out.println("--------------------");
        System.out.println("Kerkesa e 5, 6");
        ktheFjale(studentsNames);*/



    }

    private static void gjejFjalenMeTeGjate(List<String> studentsNames) {
        if(studentsNames == null || studentsNames.size() < 1){
            System.out.println("Lista qe kemi eshte bosh ");
            return;
        } else {
            Integer maxLength = studentsNames.get(0).length();
            String maxWord = studentsNames.get(0);
            for (int i = 1; i < studentsNames.size(); i++){
                if(maxLength < studentsNames.get(i).length()){
                    maxLength = studentsNames.get(i).length();
                    maxWord = studentsNames.get(i);
                }
            }

            System.out.println(maxWord + " me gjatesi : " + maxLength);
        }

    }

    public static void gjejFjalenMeTeShkurter(List<String> studentsNames) {
        if(studentsNames == null || studentsNames.size() < 1){
            System.out.println("Lista qe kemi eshte bosh ");
            return;
        } else {
            Integer minLength = studentsNames.get(0).length();
            String minWord = studentsNames.get(0);
            for (int i = 1; i < studentsNames.size(); i++){
                if(minLength > studentsNames.get(i).length()){
                    minLength = studentsNames.get(i).length();
                    minWord = studentsNames.get(i);
                }
            }

            System.out.println(minWord + " me gjatesi : " + minLength);
        }

    }

    //popullim e arraylistes nepermjet perdoruesit;
    public static List<String> populloListen(Scanner input3, List<String> names){
        System.out.println("Jep numrin e studentave keni per te ruajtur");
        Integer numriStudentave = input3.nextInt();

        for (int i = 0; i < numriStudentave; i++){
            System.out.println("Jep emrin e studentit " + (i + 1)  + " :");
            names.add(input3.next());
        }

        return names;
    }

    //printimi i studentave
    public  static void printoNames(List<String> studentsNames){
        for (int i = 0; i < studentsNames.size(); i++){
            System.out.println(studentsNames.get(i));
        }
    }


    public static void fjalaQePerseritet(List<String> studentNames){
        List<String> listOfWords = new ArrayList<>(studentNames);
        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
        for(String word : uniqueWords)
        {
            Integer frequency = Collections.frequency(listOfWords,word);
            if(frequency > 1)
                System.out.print(" fjala e perseritur eshte "+ word+", me perseritje : " +
                        frequency + " here");
        }
    }


    static void countTimesOfRepeat(List<String> names){
      List<String> test = new ArrayList<>();
      int count =0;
        for (int i = 0; i < names.size(); i++) {
            if(!test.contains(names.get(i))) {
                for (int j = i; j < names.size(); j++) {
                    if (names.get(i).equals(names.get(j))) {
                        count++;
                    }
                }
                System.out.println(names.get(i) + " eshte perseritur " + count + " here");
                test.add(names.get(i));
                count = 0;
            }
        }

    }


    static void countTimesOfRepeat9(ArrayList<String> names) {
        Map<String, Integer> countTimesOfRepeat = new HashMap<>();
        for (String name : names) {
            Integer count = countTimesOfRepeat.get(name);
            if (count == null) {
                countTimesOfRepeat.put(name, 1);
            } else {
                countTimesOfRepeat.put(name, ++count);
            }
        }
        for (Map.Entry<String, Integer> entryset : countTimesOfRepeat.entrySet()) {
            System.out.println(entryset);
        }
    }





    public static void ktheFjale(List<String> studentsNames){
        for(int i=0; i<studentsNames.size(); i++){
            if(i%2==0){
                System.out.println(studentsNames.get(i).toLowerCase(Locale.ROOT));
            }
            else{
                System.out.println(studentsNames.get(i).toUpperCase(Locale.ROOT));
            }
        }
    }

}
