package ru.aston.lessons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdExercise {
    public static String[] sortAndToArray(ArrayList<String> arrayList) {
        Collection<String> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
        String[] array = new String[sortedList.size()];
        sortedList.toArray(array);
        return array;
    }
}
