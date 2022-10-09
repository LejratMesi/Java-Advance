package com.sda.lesson.one.java18.composition;

public class RoomMain {

    public static void main(String[] args) {
        Room room = new Room(new Bed("asdfasdf","asdff"), new TV("tt",2));
    }
}
