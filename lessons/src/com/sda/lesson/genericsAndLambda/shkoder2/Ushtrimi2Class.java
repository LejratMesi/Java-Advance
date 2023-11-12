package com.sda.lesson.genericsAndLambda.shkoder2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ushtrimi2Class {
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
        for(Integer nota : notat){
            System.out.println(nota);
        }
    }

    private static void gjejMin(List<Integer> notat) {
        Integer notaMeVogel = notat.get(0);
        for (int i = 1; i < notat.size(); i++){
            if (notaMeVogel > notat.get(i)){
                notaMeVogel = notat.get(i);
            }
        }
        System.out.println("nota me e vogel eshte " + notaMeVogel);
    }

    private static void gjejMax(List<Integer> notat) {
        Integer notaMeMAdhe = notat.get(0);
        for (int i = 1; i < notat.size(); i++){
            if (notaMeMAdhe < notat.get(i)){
                notaMeMAdhe = notat.get(i);
            }
        }
        System.out.println("nota me e vogel eshte " + notaMeMAdhe);
    }

    private static void gjejMesateren(List<Integer> notat) {
        Double shuma = 0D;
        for (Integer nota : notat){
            shuma = shuma + nota;
        }

        Double mesartja = shuma / notat.size();
        System.out.println("nota me e vogel eshte " + mesartja);
    }

    private static void gjejFrekuencen(List<Integer> notat) {
        Map<Integer, Integer> frekuenca = new HashMap<>();

        for (Integer nota :notat) {
            if (frekuenca.containsKey(nota)){
                Integer value = frekuenca.get(nota);
                value = value + 1;
                frekuenca.put(nota, value);
            } else {
                frekuenca.put(nota, 0);
            }
        }


        System.out.println(frekuenca);
    }

}
