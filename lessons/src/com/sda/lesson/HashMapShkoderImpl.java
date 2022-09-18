package com.sda.lesson;

public class HashMapShkoderImpl {
    public static void main(String[] args) {
        HashMapShkoder<String,String> test = new HashMapShkoder<>("LErjat","MEsi");
        test.setKey("Lejrat");
        test.setValue("Lejrat");

        System.out.println(test.getKey());
        System.out.println(test.getValue());
    }
}
