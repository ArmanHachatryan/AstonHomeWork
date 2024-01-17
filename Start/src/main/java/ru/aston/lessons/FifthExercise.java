package ru.aston.lessons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FifthExercise {
    private static final Collection<String> logins = new ArrayList<>();

    public static void readAndPrintCorrectLogin() {
        boolean flag = true;
        while (flag) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a login: ");
            String login = in.nextLine().trim();
            flag = !login.equals(" ") && !login.isEmpty() && logins.add(login);
        }

        logins.stream().filter(p -> p.startsWith("f")).forEach(System.out::println);
    }
}
