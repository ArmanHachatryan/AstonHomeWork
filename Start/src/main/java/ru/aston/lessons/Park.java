package ru.aston.lessons;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

public class Park {
    private String parkName;

    private LocalTime openingHours;

    private LocalTime closingHours;

    public Park() {}

    public Park(String parkName, LocalTime openingHours, LocalTime closingHours) {
        this.parkName = parkName;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
    }

    public class Attraction {
        private String attractionName;

        private String description;

        private double price;

        private Duration attractionDuration;

        public String getAttractionName() {
            return attractionName;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public Duration getAttractionDuration() {
            return attractionDuration;
        }

        public Attraction() {}

        public Attraction(String attractionName, String description, double price, Duration attractionDuration) {
            this.attractionName = attractionName;
            this.description = description;
            this.price = price;
            this.attractionDuration = attractionDuration;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "attractionName='" + attractionName + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    ", attractionDuration=" + attractionDuration.toHours() +
            '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Attraction that = (Attraction) o;
            return Double.compare(price, that.price) == 0 &&
                    Objects.equals(attractionName, that.attractionName) &&
                    Objects.equals(description, that.description) &&
                    Objects.equals(attractionDuration, that.attractionDuration);
        }

        @Override
        public int hashCode() {
            return Objects.hash(attractionName, description, price, attractionDuration);
        }
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkName='" + parkName + '\'' +
                ", openingHours=" + openingHours +
                ", closingHours=" + closingHours +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return Objects.equals(parkName, park.parkName) &&
                Objects.equals(openingHours, park.openingHours) &&
                Objects.equals(closingHours, park.closingHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkName, openingHours, closingHours);
    }

    public String getParkName() {
        return parkName;
    }

    public LocalTime getOpeningHours() {
        return openingHours;
    }

    public LocalTime getClosingHours() {
        return closingHours;
    }
}
