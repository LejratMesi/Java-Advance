package com.sda;


import java.util.Scanner;

// TODO Ndertoni nje aplikacion qe kontrollon nese nje numer i dhene nga perdoruesi nese eshte apo jo ne array
public class UshtrimiMinus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni se sa numra do kete array");
        int length = input.nextInt();
        int arrayMeNumra[] = new int[length];

        //per te populluar array perdorim for loop

        for (int i = 0; i < arrayMeNumra.length; i++){
            System.out.println("Vendosni elemntin " + (i+1)  +" :");
            arrayMeNumra[i] = input.nextInt();
        }

        System.out.println("Cilin numer do kontrolloni nese eshte ne arrray apo jo");
        int numriDeshiruar = input.nextInt();
        boolean rezultati = gjejNumrin(arrayMeNumra, numriDeshiruar);
        System.out.println(rezultati);

    }

    private static boolean gjejNumrin(int[] arrayMeNumra, int numriDeshiruar) {

        for (int i = 0; i < arrayMeNumra.length;i++){
            if(arrayMeNumra[i] == numriDeshiruar) {
                return true;
            }
        }

        return false;
    }
}
