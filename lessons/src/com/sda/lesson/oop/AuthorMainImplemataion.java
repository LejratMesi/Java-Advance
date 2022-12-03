package com.sda.lesson.oop;

public class AuthorMainImplemataion {
    public static void main(String[] args) {
        Author<String> ismail = new Author<>();
        ismail.setEmri("ISMAIL");
        System.out.println(ismail.getEmri());

        Author<Integer> ismailIn = new Author<>();
        ismailIn.setEmri(2020);
        System.out.println(ismailIn.getEmri());
    }
}
