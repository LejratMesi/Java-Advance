package first.day;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A

public class FirstExercise {
    public static String[] sortFromZToA(String [] array){
        Arrays.sort(array, Collections.reverseOrder());
       // System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Strings !");
        String array[] = new String[10];
        for(Integer i = 0; i < 10 ; i++){
            array[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(sortFromZToA(array)));
    }
}
