package ru.aston.lessons;

import java.util.*;
import java.util.stream.Stream;

public class Phonebook {
    private final HashMap<String, ArrayList<Long>> hashMap = new HashMap<>();

    public void add(String lastName, long phoneNumber) {
        if (hashMap.containsKey(lastName)) {
            hashMap.get(lastName).add(phoneNumber);
        } else {
            ArrayList<Long> phoneNumberArray = new ArrayList<>();
            phoneNumberArray.add(phoneNumber);
            hashMap.put(lastName, phoneNumberArray);
        }
    }

    public void get(String lastName) {
        System.out.println(lastName);
        Stream<ArrayList<Long>> longStream = Stream.of(hashMap.get(lastName));
        longStream.flatMap(Collection::stream).forEach(System.out::println);
    }
}
