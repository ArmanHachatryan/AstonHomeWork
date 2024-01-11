package ru.aston.lessons;

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

    public void printUniqueToConsole() {
        for (var o : hm.entrySet()) {
            if (o.getValue() == 1) {
                System.out.print(o.getKey() + " ");
            }
        }
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
