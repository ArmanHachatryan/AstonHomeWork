package ru.aston.lessons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

        System.out.println(cw.countOccurrences("Корабль"));
        cw.countOccurrences();

        Phonebook ph = new Phonebook();
        ph.add("Хачатрян", 7_987_544_12_54L);
        ph.add("Хачатрян", 7_185_547_18_54L);

        ph.add("Петров", 7_987_574_12_13L);
        ph.add("Петрова", 7_967_524_12_19L);

        ph.get("Хачатрян");
        ph.get("Петров");
        ph.get("Петрова");

    }
}