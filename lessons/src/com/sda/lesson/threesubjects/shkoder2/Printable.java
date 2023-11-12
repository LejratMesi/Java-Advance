package com.sda.lesson.threesubjects.shkoder2;

@FunctionalInterface
public interface Printable {

    void printo(String emriQenit, String test);

    default void test(){

    }
}
