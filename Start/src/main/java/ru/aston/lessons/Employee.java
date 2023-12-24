package ru.aston.lessons;
import java.util.Objects;

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
    }

    public Employee(String firstName, String middleName, String lastName, long phoneNumber, int age) {
        this(
                firstName,
                middleName,
                lastName,
                "intern",
                lastName + "@mailbox.com",
                phoneNumber,
                17500,
                age
        );
    }

    public Employee(String firstName, String middleName, String lastName, String jobTitle,
                    String email, long phoneNumber, double salary, int age)
    {
        this.fullName = String.format("%s %s %s", lastName, firstName,  middleName );
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobTitle = jobTitle;
        this.email = email.toLowerCase();
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
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

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return phoneNumber == employee.phoneNumber && age == employee.age &&
                Double.compare(salary, employee.salary) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(middleName, employee.middleName) &&
                Objects.equals(jobTitle, employee.jobTitle) &&
                Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, fullName,
                jobTitle, email, phoneNumber, age, salary);
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
