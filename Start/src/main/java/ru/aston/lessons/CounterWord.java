package ru.aston.lessons;

import java.util.HashMap;

public class CounterWord<T> {
    private final T[] array;
    private final HashMap<T, Integer> hm = new HashMap<>();

    public CounterWord(T[] array) {
        this.array = array;
        toHashMap();
    }

    public int countOccurrences(T key) {
        return hm.get(key);
    }

    public void printUniqueToConsole() {
        for (var o : hm.entrySet()) {
            if (o.getValue() == 1) {
                System.out.println(o.getKey());
            }
        }
    }

    private void toHashMap() {
        for (T key : array) {
            if (hm.containsKey(key)) {
                int acc = 1;
                acc += hm.get(key);
                hm.put(key, acc);
            } else {
                hm.put(key, 1);
            }
        }
    }
}
