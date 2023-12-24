package ru.aston.lessons;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee();
        employees[1] = new Employee(
                "Stepan", "Semenovich", "Gatsiskii",
                829352372L, 25
        );
        employees[2] = new Employee(
                "Diana", "Aleksandrovna", "Vilokosova",
                "Engineer", "Vilokosova@mailbox.com",
                892312312L, 53000, 30
        );
        employees[3] = new Employee(
                "Semen", "Ramilevich", "Benkovskii",
                877353312L, 21
        );
        employees[4] = new Employee(
                "Igor", "Damirovich", "Dolgodumov",
                877353312L, 24
        );
    }
}

