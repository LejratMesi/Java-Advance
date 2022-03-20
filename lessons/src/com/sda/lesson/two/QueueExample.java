package com.sda.lesson.two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Pikachu1");
        pokemons.offer("Pikachu2");
        pokemons.offer("Pikachu3");
        pokemons.offer("Pikachu4");
        pokemons.offer("Pikachu5");
        pokemons.offer("Pikachu6");
        String str = pokemons.poll();
        String str1 = pokemons.poll();
        String str2 = pokemons.poll();
        System.out.println(pokemons.poll());
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
