package com.sda.lesson.threesubjects.shkoder2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
* Do krijoni nje ArrayList me 10 elementa
elementat do jene Integer
do vendosni ne array 10 Integersi te doni nese do ni mund te pyesni dhe userin
pastaj do krijoni metodat perkatese :
shfaq te gjith Integer
gjej min
gjej max
gjej mesatrent
gjejFrequencen e numrave
* */
public class Ushtrimi2Stream {
    public static void main(String[] args) {
        List<Integer> notat = new ArrayList<>();
        notat.add(1654);
        notat.add(11234);
        notat.add(1654);
        notat.add(155);
        notat.add(11234);
        notat.add(155);
        notat.add(11234);
        notat.add(1234);
        notat.add(1234);

        printoNotat(notat);
        gjejMin(notat);
        gjejMesateren(notat);
        gjejMax(notat);
        gjejFrekuencen(notat);
    }



    private static void printoNotat(List<Integer> notat) {
        notat.forEach(System.out::println);
    }

    private static void gjejMin(List<Integer> notat) {
        int notaMeVogel = Collections.min(notat);
        System.out.println("nota me e vogel eshte " + notaMeVogel);
    }

    private static void gjejMax(List<Integer> notat) {
        int notaMeMadhe = Collections.max(notat);
        System.out.println("nota me e madhe eshte " + notaMeMadhe);
    }

    private static void gjejMesateren(List<Integer> notat) {
        double average = notat.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("average  eshte " + average);
    }

    private static void gjejFrekuencen(List<Integer> notat) {
        Map<Object, Long> frequenca = notat
                .stream()
                .collect(Collectors.groupingBy( e -> e, Collectors.counting()));

        System.out.println(frequenca);
    }

}
