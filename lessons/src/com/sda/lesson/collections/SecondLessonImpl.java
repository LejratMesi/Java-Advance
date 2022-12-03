package com.sda.lesson.collections;

public class SecondLessonImpl implements SecondLeson{
    //Ka 2 members
    private Integer numrat[];
    private String emrat[];

    public SecondLessonImpl(Integer[] numrat, String[] emrat) {
        this.numrat = numrat;
        this.emrat = emrat;
    }

    @Override
    public Integer findMax() {
        Integer max = numrat[0];
        //bredhjen e array-it
        for (int i = 1;i< numrat.length;i++){
            if(numrat[i]> max){
                max = numrat[i];
            }
        }

        return max;
    }

    @Override
    public void findSum(Integer number, Integer number2) {
            Integer sum = 0;
            for (int i = number;i<=number2;i++){
                sum += i;
            }

        System.out.println("Shuma eshte = " + sum);
    }

    @Override
    public void printWordsThatEndsWithLetterR() {
        for (int i = 0;i< emrat.length;i++){
            if(emrat[i].endsWith("R")){
                System.out.println(emrat[i]);
            }
        }
    }
}
