package com.sda.lesson.oop;

public class FirstLesson {
    private String name;
    private String surname;

    static class NestedFirstLesson{
        private int minutes;
        private int hours;
    }

    public void createAClass(String name, String surname, String job){
        class Person{
            public String name;
            public String surname;
            public String job;

            public void print(){
                System.out.println("HELLO World");
            }

        }

        Person person1 = new Person();

        person1.job = job;

    }


     class InnerFirstLesson{
        private int minutes;
        private int hours;
    }
}
