package com.sda.lesson.oop.kukes;

import com.sda.lesson.oop.ArrayInterface;

public class Kukes implements FirstInterface, ArrayInterface {
    @Override
    public void printTEst() {
        System.out.println("Test nga klasa kukes");
    }

    @Override
    public void printoNUmerTEk() {
        System.out.println("Numer Tek  nga klasa kukes");
    }

    @Override
    public void eshteNumriTekApoCift(int numri) {
        if(numri % 2 == 0){
            System.out.println("Numri " + numri + " eshte cift");
        } else {
            System.out.println("Numri " + numri + " eshte tek");
        }
    }

    @Override
    public void printContinentName() {

    }

    @Override
    public void nameThaStartsWithLetterS() {

    }

    @Override
    public void maxPopullsia() {

    }
}
