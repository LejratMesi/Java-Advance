package com.sda.lesson.oop.composition;

public class MainClass {
    public static void main(String[] args) {
        Room room = new Room(new TV("Samsung", 123), new Bed("LErjat","MEsi"));
    }
}
