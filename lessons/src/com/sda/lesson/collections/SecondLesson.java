package com.sda.lesson.collections;

public class SecondLesson {
    public static void main(String[] args) {
        SecondLessonImpl exercise = new SecondLessonImpl(new Integer[]{1,2,3,4,5},
                new String[]{"LEjraR","rrrr","mesi"});

        System.out.println("Maximumi eshte +" + exercise.findMax());
        exercise.findSum(4,10);
        exercise.printWordsThatEndsWithLetterR();
    }

}
