package ru.aston.lessons;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String jobTitle;
    private String email;
    private long phoneNumber;
    private int age;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, String jobTitle,
                    String email, long phoneNumber, double salary, int age) {
        this.fullName = String.format("%s %s %s", lastName, firstName, middleName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobTitle = jobTitle;
        this.email = email.toLowerCase();
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf(
                "Сотрудник\n" +
                        "ФИО: %s\n" +
                        "Должность: %s\n" +
                        "Почта: %s\n" +
                        "Телефонный номер: +%d\n" +
                        "Зарплата: %.2f\n" +
                        "Возраст: %d\n"
                , fullName, jobTitle, email, phoneNumber, salary, age
        );
    }
}
