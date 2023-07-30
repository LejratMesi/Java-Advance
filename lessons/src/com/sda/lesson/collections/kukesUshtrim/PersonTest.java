package com.sda.lesson.collections.kukesUshtrim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Lejrat", "Mesi", 20));
        personList.add(new Person("Lejrat1", "Mesi1", 220));
        personList.add(new Person("Lejrat1", "Mesi", 25));
        personList.add(new Person("Lejrat2", "Mesi", 280));
        personList.add(new Person("Lejrat3", "Mesi", 260));
        personList.add(new Person("Lejrat", "Mesi", 2230));
        personList.add(new Person("Lejrat", "Mesi", 2980));

        printoArrayList(personList);

        gjejPersoninMeMoshenMeTeMadhe(personList);

        gjejFrekuencenEmrave(personList);
    }

    private static void gjejFrekuencenEmrave(List<Person> personList) {
        HashMap<String,Integer> frekuenca = new HashMap<>();

        for(Person person : personList){
            if(frekuenca.containsKey(person.getEmer())){
                int value = frekuenca.get(person.getEmer()) + 1;
                frekuenca.put(person.getEmer(), value);
            } else {
                frekuenca.put(person.getEmer(), 0);
            }
        }


        for(Map.Entry<String,Integer> pairs : frekuenca.entrySet()){
            System.out.println(pairs);
        }
    }

    private static void gjejPersoninMeMoshenMeTeMadhe(List<Person> personList) {

        if(personList == null && personList.size() == 0){
            System.out.println("Ska asnje person lista ...");
            return;
        }
        Person firstPerson = personList.get(0);
        Integer moshaMeEmadhe = firstPerson.getMosha();


        for(int i =1; i< personList.size();i++){
            if(moshaMeEmadhe < personList.get(i).getMosha()){
                moshaMeEmadhe = personList.get(i).getMosha();
                firstPerson = personList.get(i);
            }
        }


        System.out.println("Personi qe ka moshen me te madhe eshte : " + firstPerson.toString());
    }

    private static void printoArrayList(List<Person> personList) {
        for (Person person: personList){
            System.out.println(person);
        }
    }
}
