package com.sda.lesson.threesubjects.shkoder2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmratProgram {

    public static void main(String[] args) {
        ArrayList<String> emrat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Vendsni emrin e studentit te " + (i + 1) + ": ");
            emrat.add( input.nextLine());
        }

        // Thirr metoden shfaqEmrat
        shfaqEmrat(emrat);

        // Thirr metoden gjejEmrinMePakKaraktere
        String emriMePakKaraktere = gjejEmrinMePakKaraktere(emrat);
        System.out.println("Emri me pak karaktere: " + emriMePakKaraktere);

        // Thirr metoden gjejEmrinMeShumeKaraktere
        String emriMeShumeKaraktere = gjejEmrinMeShumeKaraktere(emrat);
        System.out.println("Emri me shume karaktere: " + emriMeShumeKaraktere);

        // Thirr metoden shkronjeMadhePerS
        emratMeShkonjenSBejiMeTeMedha(emrat);
        System.out.println("Emrat me S te bera me te medha: " + emrat);

        // Thirr metoden printoEmratMeNumer
        System.out.println("Emrat me numra: ");
        printoEmratMeNumer(emrat);

        // Thirr metoden printoEmratMeKaraktereCift
        System.out.println("Emrat me numer karakteresh cift: ");
        printoEmratMeKaraktereCift(emrat);

        input.close();
    }

    // Metoda për të shfaqur të gjithë emrat
    public static void shfaqEmrat(ArrayList<String> emrat) {
        for (String emri : emrat) {
            System.out.println(emri);
        }
    }

    // Metoda për të gjetur emrin me pak karaktere
    public static String gjejEmrinMePakKaraktere(ArrayList<String> emrat) {
        String name = emrat.get(0);
        for (String n : emrat) {
            if (n.length() < name.length()) {
                name = n;
            }
        }
        return name;
    }

    // Metoda për të gjetur emrin me shumë karaktere
    public static String gjejEmrinMeShumeKaraktere(ArrayList<String> emrat) {
        String name = emrat.get(0);
        for (String n : emrat) {
            if (n.length() > name.length()) {
                name = n;
            }
        }
        return name;
    }

    // Metoda për të bërë emrat që fillojnë me "S" të bëhen më të mëdha
    public static void emratMeShkonjenSBejiMeTeMedha(ArrayList<String> emrat) {
        for (String emri : emrat) {
            if (emri.startsWith("S")) {
                System.out.println(emri.toUpperCase());
            } else {
                System.out.println(emri);
            }
        }
    }

    // Metoda për të printuar emrat që kanë numra
    public static void printoEmratMeNumer(ArrayList<String> emrat) {
        for (String name : emrat) {
            if (name.length() % 2 != 0) {
                System.out.println(name);
            }
        }
    }

    // Metoda për të printuar emrat që kanë numra cift në numrin e karaktereve
    public static void printoEmratMeKaraktereCift(ArrayList<String> emrat) {
        System.out.println("Metoda printoEmratQeKaneNumerCiftKarakteresh");
        for (String name : emrat) {
            if (name.length() % 2 == 0) {
                System.out.println(name);
            }
        }
    }
}
