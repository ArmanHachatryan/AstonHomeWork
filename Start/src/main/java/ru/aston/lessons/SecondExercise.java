package ru.aston.lessons;

import java.util.ArrayList;
import java.util.Optional;

public class SecondExercise {
    private SecondExercise() {
    }

    public static long countRepetitionOfHigh(ArrayList<String> arrayList) {
        return arrayList.stream().filter(w -> w.equals("High")).count();
    }

    public static String getFirst(ArrayList<String> arrayList) {
        Optional<String> first = arrayList.stream().findFirst();
        return first.orElse("0");
    }

    public static String getLast(ArrayList<String> arrayList) {
        long count = arrayList.size();
        Optional<String> last = arrayList.stream().skip(count - 1).findFirst();
        return last.orElse("0");
    }
}
