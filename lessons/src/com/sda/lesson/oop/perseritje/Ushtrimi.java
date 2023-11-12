package com.sda.lesson.oop.perseritje;

import java.util.Scanner;

/* Do krijoni nje applikacion qe kerkon nga perdoruesi nje numer qe do te jete gjatesia e array.
         do te kete keto metodat :
         - popullo array -> do i kerkoni userit qe te japi numrat e arrayt dhe do e populloni array
         - printo array
         - gjej maximumin
         - gjej minimumin*/
public class Ushtrimi {
    public static void main(String[] args) {

        System.out.println("Ju lutem vendosni nje numer qe do t ejete gjatesia e Array");
        Scanner input = new Scanner(System.in);
        int gjatesiaArray = input.nextInt();
        //deklarimi i array
        int[] vlerat = new int[gjatesiaArray];

        populloArray(vlerat,input);
        printoArray(vlerat);
        printoMaximumin(vlerat);
        printoMinimumin(vlerat);
    }

    private static void printoMaximumin(int[] vlerat) {
        if (vlerat.length == 0){
            System.out.println("Ne nuk mund te gjejme asnje maximum per array sepse ai eshte bosh ose nuk eshte i inicializuar");
            return;
        }

        int maximumi = vlerat[0];

        for(int i = 1 ; i< vlerat.length; i++){
            if (maximumi < vlerat[i]){
                maximumi = vlerat[i];
            }
        }

        System.out.println("Maximumim i array esht enumri : " + maximumi);
    }

    private static void printoMinimumin(int[] vlerat) {
        if (vlerat.length == 0){
            System.out.println("Ne nuk mund te gjejme asnje maximum per array sepse ai eshte bosh ose nuk eshte i inicializuar");
            return;
        }

        int minimumi = vlerat[0];

        for(int i = 1 ; i< vlerat.length; i++){
            if (minimumi > vlerat[i]){
                minimumi = vlerat[i];
            }
        }

        System.out.println("Minimumi i array esht enumri : " + minimumi);
    }

    private static void printoArray(int[] vlerat) {
        for(int i = 0; i < vlerat.length; i++){
            System.out.println("Vlera ne pozicionin " + i + " eshte : " + vlerat[i]);
        }
    }

    private static void populloArray(int[] vlerat, Scanner input1) {

        for(int i = 0; i < vlerat.length; i++){
            System.out.println("Jep nje vlere:");
            vlerat[i] = input1.nextInt();
        }
    }
}
