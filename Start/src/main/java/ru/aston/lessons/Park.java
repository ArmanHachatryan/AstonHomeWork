package ru.aston.lessons;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

public class Park {
    private String parkName;
    private LocalTime openingHours;
    private LocalTime closingHours;

    public Park(String parkName, LocalTime openingHours, LocalTime closingHours) {
        this.parkName = parkName;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
    }

    public void getInfo() {
        System.out.printf(
                "Парк\n" +
                        "Название: %s\n" +
                        "Открыт с: %s\n" +
                        "Закрывается в: %s\n"
                , parkName, openingHours, closingHours
        );
    }

    public class Attraction {
        private String attractionName;
        private double price;
        private Duration attractionDuration;

        public Attraction(String attractionName, double price, Duration attractionDuration) {
            this.attractionName = attractionName;
            this.price = price;
            this.attractionDuration = attractionDuration;
        }

        public void getInfo() {
            System.out.printf(
                    "Атракцион\n" +
                            "Название: %s\n" +
                            "Цена: %.1f руб\n" +
                            "Проработанное время: %s мин\n" +
                            "Находится в парке: %s"
                    , attractionName, price, attractionDuration.toMinutes(), parkName
            );
        }


    }
}
