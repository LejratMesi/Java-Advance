package com.sda.lesson.genericsAndLambda.shkoder2;

import java.util.ArrayList;
import java.util.List;

public class GenericClassNeed {
    public static void main(String[] args) {
        List<String> te = new ArrayList<>();
        List<Integer> te1 = new ArrayList<>();

        GenericClassExample<String> genericClassExample = new GenericClassExample<>("shkoder");
        GenericClassExample<Integer> genericClassExample1 = new GenericClassExample<>(12);

        genericClassExample.printo();
        genericClassExample1.printo();
    }
}
