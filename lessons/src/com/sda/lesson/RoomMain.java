package com.sda.lesson;

public class RoomMain {
    public static void main(String[] args) {
        Bed bedroom= new Bed("Bedroom", "Master");
        TV samsung = new TV("Samsung", 90);
        Room room = new Room(bedroom,samsung);
        System.out.println(room.getBed().getBedtype());
        System.out.println(room.getBed().getName());
        System.out.println(room.getTv().getType());
        System.out.println(room.getTv().getSize());
    }
}
