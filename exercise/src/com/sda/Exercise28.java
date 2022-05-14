package com.sda;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {

        getEveryNthElement(2,4);

    }

    public static void getEveryNthElement(Integer startIndex, Integer skip){
        ArrayList<String> element=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sa elemente do vendosni? ");
        Integer numra=scanner.nextInt();
        System.out.println("Jepni elementet per te mbyshur ArrayListen: ");
        for (int i=0; i<numra;i++){
            element.add(scanner.next());
        }

        if (startIndex+skip+1>element.size()){
            System.out.println("Elementi startindex eshte : " +element.get(startIndex) + " dhe nuk ka element pas " + skip +" elementesh.");
        }
        else
            System.out.println("Elementi i index " +startIndex + " eshte : *** " + element.get(startIndex) + " *** dhe elementi pas " +skip + " elementesh,eshte : " + element.get(startIndex+skip+1));

        }

}
