package com.sda.lesson.genericsAndLambda.shkoder2;

import java.util.ArrayList;
import java.util.List;

/*
* Do krijoni nje ArrayList me 10 elementa
elementat do jene String
do vendosni ne array 10 Emra si te doni nese doni mund te pyesni dhe userin
pastaj do krijoni metodat perkatese :
shfaq te gjith emrat
gjej emrin qe ka me pak karaktere
gjej emrin qe ka me shume karaktere
gjej mesataren e karaktereve te emrave
emrat qe fillojne me S te behen me te medha
printo emrat qe kane numer tek karakteresh
printo emrat qe kane numer cift karakteresh
* */
public class UShtrimiMeStream {
    public static void main(String[] args) {
        List<String> emrat = new ArrayList<>();
        emrat.add("Lejrat");
        emrat.add("A");
        emrat.add("Beni");
        emrat.add("Sami Frasheri");
        emrat.add("Sindi");
        emrat.add("Sukth");
        emrat.add("Agoni");
        emrat.add("Goni");
        emrat.add("Gimi");
        emrat.add("Shkoder");


        gjejEmrinMeMePakKaraktere(emrat);
        gjejEmrinMeMeShumekaraktere(emrat);
        gjejMesatarenEEmrave(emrat);
        vendosMeGermaTeMedhaEmratQeFillojneMeS(emrat);
        printoEmratQeKaneNumerTekKarakteresh(emrat);
        printoEmratQeKaneNumerCiftKarakteresh(emrat);
    }

    private static void printoEmratQeKaneNumerCiftKarakteresh(List<String> emrat) {
        System.out.println("Metoda printoEmratQeKaneNumerCiftKarakteresh");
        emrat.stream()
                .filter(emri -> emri.length() % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printoEmratQeKaneNumerTekKarakteresh(List<String> emrat) {
        System.out.println("Metoda printoEmratQeKaneNumerTekKarakteresh");
        emrat.stream()
                .filter(emri -> emri.length() % 2 != 0)
                .forEach(System.out::println);
    }

    private static void vendosMeGermaTeMedhaEmratQeFillojneMeS(List<String> emrat) {
        System.out.println("Metoda vendosMeGermaTeMedhaEmratQeFillojneMeS");
        emrat.stream()
           .map(emri -> emri.startsWith("S") ? emri.toUpperCase() : emri)
           .forEach(System.out::println);
    }

    private static void gjejMesatarenEEmrave(List<String> emrat) {
        Double mesatarja  = emrat.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println("Mesatarja e emrave eshte : " + mesatarja);
    }

    private static void gjejEmrinMeMeShumekaraktere(List<String> emrat) {
        String emriMeMeShumeKaraktere = emrat.stream()
                .max((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                .orElse(null);

        if(emriMeMeShumeKaraktere == null){
            System.out.println("ne list nuk ka pasu asnje element");
        } else {
            System.out.println("Emri me me shume karaktere eshte : " + emriMeMeShumeKaraktere);
        }
    }

    private static void gjejEmrinMeMePakKaraktere(List<String> emrat) {
        String emriMEPakKaraketere = emrat
                .stream()
                .min((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                .orElse(null);

        if(emriMEPakKaraketere == null){
            System.out.println("ne list nuk ka pasu asnje element");
        } else {
            System.out.println("Emri me me pak karaktere eshte : " + emriMEPakKaraketere);
        }
    }
}
