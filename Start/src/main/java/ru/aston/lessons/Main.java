package ru.aston.lessons;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String[] array = {
                "Авианосец", "Вилка", "Диктофон", "Закономерный", "Наркоз",
                "Овальный", "Корабль", "Рифмовать", "Рокфор", "Беда",
                "Книга", "Корабль", "Корабль", "Диктофон", "Java",
                ".Net", "Python", "Javac", "JavaScript", "Авианосец"
        };

        CounterWord cw = new CounterWord(array);

        cw.printUniqueToConsole();
        System.out.println();

        System.out.println(cw.countOccurrences("Корабль"));
    }
}