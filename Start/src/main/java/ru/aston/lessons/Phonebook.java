package ru.aston.lessons;

import java.util.*;
import java.util.stream.Stream;

public class Phonebook {
    private final HashMap<String, ArrayList<Long>> lastNameAndPhone = new HashMap<>();

    public void add(String lastName, long phoneNumber) {
        if (lastNameAndPhone.containsKey(lastName)) {
            lastNameAndPhone.get(lastName).add(phoneNumber);
        } else {
            ArrayList<Long> phoneNumberArray = new ArrayList<>();
            phoneNumberArray.add(phoneNumber);
            lastNameAndPhone.put(lastName, phoneNumberArray);
        }
    }

    public void get(String lastName) {
        System.out.println(lastName);
        Stream<ArrayList<Long>> longStream = Stream.of(lastNameAndPhone.get(lastName));
        longStream.flatMap(Collection::stream).forEach(System.out::println);
    }
}
