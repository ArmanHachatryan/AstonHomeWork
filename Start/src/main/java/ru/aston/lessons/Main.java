package ru.aston.lessons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        String[] array = {
//                "Авианосец", "Вилка", "Диктофон", "Закономерный", "Наркоз",
//                "Овальный", "Корабль", "Рифмовать", "Рокфор", "Беда",
//                "Книга", "Корабль", "Корабль", "Диктофон", "Java",
//                ".Net", "Python", "Javac", "JavaScript", "Авианосец"
//        };
//
//        CounterWord cw = new CounterWord(array);
//        cw.printUniqueToConsole();
//
//        System.out.println(cw.countOccurrences("Корабль"));
//        cw.countOccurrences();
//
        Phonebook ph = new Phonebook();
        ph.add("A", 54L);

        ph.add("A", 56L);

        ph.get("A");

    }
}