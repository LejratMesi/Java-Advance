package com.sda.lesson.one.composition;

public class MainClass {
    public static void main(String[] args) {
        Room room = new Room(new TV("Samsung", 123), new Bed("LErjat","MEsi"));
    }
}
