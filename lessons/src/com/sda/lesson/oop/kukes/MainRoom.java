package com.sda.lesson.oop.kukes;

public class MainRoom {
    public static void main(String[] args) {
        Room room = new Room(new Bed("JAVA", "Kukes"), new TV("Grupi1", 50));
        System.out.println(room.getBed().getBedRoomType());
        System.out.println(room.getBed().getName());
        System.out.println(room.getTv().getSize());
        System.out.println(room.getTv().getType());
    }
}
