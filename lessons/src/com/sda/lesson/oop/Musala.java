package com.sda.lesson.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Musala {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("lejrat", "12" , " 500"));
        items.add(Arrays.asList("serxho", "3" , " 5120"));
        items.add(Arrays.asList("nura", "6" , " 900"));
        items.add(Arrays.asList("gridi", "4" , " 12300"));

      //  sort2dArray();
    }



    //Sortosh listem me items ne varesi te sortParameter dhe sortway qe eshte 1 = ASC 0 Eshte DESC ,
    // x eshte se sa elemnte dpo me kthesh mua (do me kthesh vetem emrin jo te tjeret)[lejrat,gridi] nese X eshte 2
    // Sortparameter eshte 0,1,2 ne varesi te numir eshte 0-> "Lejrat", 1->"12, 2->"500"

    private static List<String> sort2dArray(List<List<String>> items, int sortParameter, int sortWAy, int X) {
    return null;}
}
