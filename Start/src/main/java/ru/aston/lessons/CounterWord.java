package ru.aston.lessons;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Stream;

public class CounterWord {
    private final String[] array;
    private final HashMap<String, Integer> hm = new HashMap<>();

    public CounterWord(String[] array) {
        this.array = array;
        toHashMap();
    }

    public int countOccurrences(String key) {
        return hm.get(key);
    }

    public void countOccurrences() {
        Stream<HashMap<String, Integer>> ms = Stream.of(hm);
        ms.flatMap(p -> Stream.of(p.entrySet()))
                .flatMap(Collection::stream)
                .forEach(p -> System.out.println(p.getKey() + "=" + p.getValue()));
        ms.close();
    }

    public void printUniqueToConsole() {
        Stream<HashMap<String, Integer>> ms = Stream.of(hm);
        ms.flatMap(p -> Stream.of(p.entrySet()))
                .flatMap(Collection::stream)
                .filter(p -> p.getValue() == 1)
                .forEach(p -> System.out.println(p.getKey()));
        ms.close();
    }

    private void toHashMap() {
        for (String key : array) {
            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }
    }
}
