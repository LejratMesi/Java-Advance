package com.sda.lesson.genericsAndLambda.shkoder2;

@FunctionalInterface
public interface Printable {

    void printo(String emriQenit, String test);

    default void test(){

    }
}
