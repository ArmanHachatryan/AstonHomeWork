package ru.aston.lessons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FifthExercise {
    private FifthExercise() {
    }

    private static final Collection<String> input = new ArrayList<>();

    public static void startProgram() {
        boolean flag = true;
        while (flag) {
            String data = getDataFromConsole();
            flag = isEnd(data);
        }

        printToConsole();
    }

    private static String getDataFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a login: ");
        return in.nextLine().trim();
    }

    private static void printToConsole() {
        input.stream().filter(p -> p.startsWith("f")).forEach(System.out::println);
    }

    private static boolean isEnd(String str) {
        return !str.equals(" ") && !str.isEmpty() && input.add(str);
    }
}
