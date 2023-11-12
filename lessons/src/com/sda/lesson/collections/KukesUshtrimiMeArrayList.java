package com.sda.lesson.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Krijoni nje applikacion qe merr inforacione nga useri dhe i shton ne nje List(ArrayList)
        ndertoni metodat :
        populloList
        gjej emrin me te shkurter
        gjej emrin me te gjate*/
public class KukesUshtrimiMeArrayList {

    public static void main(String[] args) {
        //Nga vete kerkesa une kuptj qe do marr nga perdoruesi te dhena pra
        Scanner input  = new Scanner(System.in);
        ///Duke qene se nga kerka une kam te shkruar qe te dhenat do i ruaj ne Arraylist atehre
        List<String> emrat = new ArrayList<>();
        //Nga kerkesa kemi emrin e metodes populloList
        populloList(emrat,input);
        
        //Nga kerkesa kam gjej emrin me te shkurter
        gjejEmrinMeteShkurter(emrat);
        
        //Nga kerksa kam gjej emrin me te gjate 
        gjejEmrinMeTeGjate(emrat);



    }

    private static void gjejEmrinMeTeGjate(List<String> emrat) {
        //Per te gjet emrin me te shkurter mua me duhet gjatesia e emrit
        // ashtu sic kam vepruar per te gjet numrin me te vogel ne array

        if (emrat != null && emrat.size() == 0 ){// ca gabimi kam ketu
            System.out.println("Nuk mund te gjendet emri me i shkurter sepse lista eshte bosh ");
            return;
        }


        int gjatesiaEmritMeTeGjate = emrat.get(0).length();
        String emriMeIGjate = emrat.get(0);

        for(int i =1 ; i< emrat.size(); i++){
            if(gjatesiaEmritMeTeGjate < emrat.get(i).length()){
                gjatesiaEmritMeTeGjate = emrat.get(i).length();
                emriMeIGjate = emrat.get(i);
            }
        }

        System.out.println("Emri me i gjate eshte  " + emriMeIGjate);
        System.out.println("Me gjatesi " + gjatesiaEmritMeTeGjate);
    }

    private static void gjejEmrinMeteShkurter(List<String> emrat) {
        //Per te gjet emrin me te shkurter mua me duhet gjatesia e emrit 
        // ashtu sic kam vepruar per te gjet numrin me te vogel ne array

        if (emrat != null && emrat.size() == 0 ){// ca gabimi kam ketu
            System.out.println("Nuk mund te gjendet emri me i shkurter sepse lista eshte bosh ");
            return;
        }
        
        
        int gjatesiaEmritMeTeShkurter = emrat.get(0).length();
        String emriMeIShkurter = emrat.get(0);
        
        for(int i =1 ; i< emrat.size(); i++){
            if(gjatesiaEmritMeTeShkurter > emrat.get(i).length()){
                gjatesiaEmritMeTeShkurter = emrat.get(i).length();
                emriMeIShkurter = emrat.get(i);
            }
        }

        System.out.println("Emri me i shkurter eshte  " + emriMeIShkurter);
        System.out.println("Me gjatesi " + gjatesiaEmritMeTeShkurter);
    }

    private static void populloList(List<String> emrat, Scanner input) {
        //Duke qene se une nuk kam nje numer te caktuar se sa emra sdo te kete lista ateher
        System.out.println("Ju lutem vendosni se sa emra do te jepni");
        int numriEmrave = input.nextInt();
        
        //Duke qene se tani kam nje numer emrash atehere e vetmja gje eshte qe te bej nje cikel for 
        for(int i = 0 ; i< numriEmrave;i++) { //pytje pse kam vendos numriEmrave -1
            System.out.println("Ju lutem jepni nje Emer");
            emrat.add(input.next());
            
        }
    }

}
