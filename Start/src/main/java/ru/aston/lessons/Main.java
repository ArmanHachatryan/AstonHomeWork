package ru.aston.lessons;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] array = {
                "Авианосец", "Вилка", "Диктофон", "Закономерный", "Наркоз",
                "Овальный", "Корабль", "Рифмовать", "Рокфор", "Беда",
                "Книга", "Корабль", "Корабль", "Диктофон", "Java",
                ".Net", "Python", "Javac", "JavaScript", "Авианосец"
        };

        Integer[] nums = {4, 5, 4, 3, 1};

        CounterWord<String> cw = new CounterWord<>(array);


        CounterWord<Integer> cwint = new CounterWord<>(nums);

        cw.printUniqueToConsole();

        System.out.println(cw.countOccurrences("Корабль"));

        cwint.printUniqueToConsole();


    }
}