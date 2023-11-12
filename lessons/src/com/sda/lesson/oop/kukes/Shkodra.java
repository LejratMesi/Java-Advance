package com.sda.lesson.oop.kukes;

public class Shkodra implements FirstInterface{
    @Override
    public void printTEst() {
        System.out.println("TEst nga klasa shkoder");
    }

    @Override
    public void printoNUmerTEk() {
        System.out.println("Tek nga klasa shkoder");
    }

    @Override
    public void eshteNumriTekApoCift(int numri) {
        if(numri % 2 == 0){
            System.out.println("Numri " + numri + " eshte cift nga klasa Shkoder");
        } else {
            System.out.println("Numri " + numri + " eshte tek nga klasa Shkoder");
        }
    }
}
