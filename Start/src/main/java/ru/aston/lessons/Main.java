package ru.aston.lessons;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(FirstExercise.countEven(nums));

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Highload", "High", "Load", "Highload");
        System.out.println(SecondExercise.countRepetitionOfHigh(list));
        System.out.println(SecondExercise.getFirst(list));
        System.out.println(SecondExercise.getLast(list));
    }
}