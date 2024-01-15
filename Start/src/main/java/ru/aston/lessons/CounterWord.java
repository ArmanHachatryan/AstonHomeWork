package ru.aston.lessons;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Stream;

public class CounterWord {
    private final String[] arrayOfWord;
    private final HashMap<String, Integer> hashMap = new HashMap<>();

    public CounterWord(String[] arrayOfWord) {
        this.arrayOfWord = arrayOfWord;
        toHashMap();
    }

    public int countOccurrences(String word) {
        return hashMap.get(word);
    }

    public void countOccurrences() {
        Stream<HashMap<String, Integer>> streamOfHashMap = Stream.of(hashMap);
        streamOfHashMap.flatMap(p -> Stream.of(p.entrySet()))
                .flatMap(Collection::stream)
                .forEach(p -> System.out.println(p.getKey() + "=" + p.getValue()));
    }

    public void printUniqueToConsole() {
        Stream<HashMap<String, Integer>> streamOfHashMap = Stream.of(hashMap);
        streamOfHashMap.flatMap(p -> Stream.of(p.entrySet()))
                .flatMap(Collection::stream)
                .filter(p -> p.getValue() == 1)
                .forEach(p -> System.out.println(p.getKey()));
    }

    private void toHashMap() {
        for (String word : arrayOfWord) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }
    }
}
