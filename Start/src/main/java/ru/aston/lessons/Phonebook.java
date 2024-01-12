package ru.aston.lessons;

import java.security.Key;
import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Phonebook {
    private final HashMap<String, ArrayList<Long>> hs = new HashMap<>();

    public void add(String lastName, long phoneNumber) {
        if (hs.containsKey(lastName)) {
            hs.get(lastName).add(phoneNumber);
        } else {
            ArrayList<Long> al = new ArrayList<>();
            al.add(phoneNumber);
            hs.put(lastName, al);
        }


    }

    public void get(String lastName) {
        Stream<ArrayList<Long>> longStream = Stream.of(hs.get(lastName));
        longStream.flatMap(Collection::stream).forEach(System.out::println);
    }
}
