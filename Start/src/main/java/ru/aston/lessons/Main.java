package ru.aston.lessons;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Stas", "Alexandrovich", "Belousov",
                "Load QA", "Belousov@mailbox.com",
                8_924_176_18_54L, 120_000, 23
        );
        employees[1] = new Employee(
                "Alexey", "Aleksandrovich", "Salahutdinov",
                "Intern", "Salahutdinov@mailbox.com",
                8_961_173_16_54L, 50_000, 24
        );
        employees[2] = new Employee(
                "Arman", "Mgerovich", "Hachatryan",
                "Qa intern", "Hachatryan@mailbox.com",
                8_954_126_18_74L, 17_000, 23
        );
        employees[3] = new Employee(
                "Diana", "Aleksandrovna", "Vilokosova",
                "Engineer", "Vilokosova@mailbox.com",
                8_954_116_78_14L, 23000, 40
        );
        employees[4] = new Employee(
                "Masha", "Genadevna", "Fedina",
                "Engineer", "Genadevna@mailbox.com",
                8_934_156_18_54L, 43000, 30
        );

        employees[4].getInfo();

        System.out.println();

        Park park = new Park("Flowers",
                LocalTime.of(7, 0, 0),
                LocalTime.of(21, 0, 0)
        );

        park.getInfo();

        System.out.println();
        
        Park.Attraction attraction = park.new Attraction(
                "HellWheel",
                300,
                Duration.ofHours(50)
        );

        attraction.getInfo();


    }
}