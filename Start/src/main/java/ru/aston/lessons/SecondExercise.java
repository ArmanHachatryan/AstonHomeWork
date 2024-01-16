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
        return arrayList.stream().findFirst().orElse("0");
    }

    public static String getLast(ArrayList<String> arrayList) {
        return arrayList.stream().skip(arrayList.size() - 1).findFirst().orElse("0");
    }
}
