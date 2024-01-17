package ru.aston.lessons;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class FourthExercise {

    Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 17, Sex.MAN),
            new Student("Максим", 20, Sex.MAN),
            new Student("Екатерина", 20, Sex.WOMAN),
            new Student("Михаил", 28, Sex.MAN)
    );

    private enum Sex {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Sex gender;

        public Student(String name, Integer age, Sex gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getGender() {
            return gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    public double avgAgeMen() {
        int ageSum = students.stream().filter(p -> p.gender == Sex.MAN).mapToInt(Student::getAge).sum();
        long count = students.stream().filter(p -> p.gender == Sex.MAN).count();
        return (double) ageSum / count;
    }

    public void militaryAge() {
        students.stream().filter(p -> p.gender == Sex.MAN)
                .filter(p -> p.age >= 18 && p.age <= 27)
                .forEach(p -> System.out.println(p.name));
    }
}
