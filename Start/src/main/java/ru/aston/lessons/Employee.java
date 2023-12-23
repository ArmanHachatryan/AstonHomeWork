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

    public Employee() {
        this(
                "default",
                "default",
                "default",
                "default",
                "default@mail.ru",
                79999999999L,
                0,
                0
        );
    }

    public Employee(String fullName, String jobTitle, String email, long phoneNumber, double salary, int age) {
        this.fullName = fullName;
        parseFullName(fullName);
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String firstName, String middleName, String lastName, String jobTitle,
                    String email, long phoneNumber, double salary, int age)
    {
        this.fullName = String.format("%s %s %s", lastName, firstName,  middleName );
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    private void parseFullName(String fullName){
        this.lastName = fullName.split("\\s")[0];
        this.firstName = fullName.split("\\s")[1];
        this.middleName = fullName.split("\\s")[2];
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName +
                ", jobTitle='" + jobTitle +
                ", email='" + email +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void Print() {
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
