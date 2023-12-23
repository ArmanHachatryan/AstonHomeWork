package ru.aston.lessons;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        System.out.println(e1);

        e1.Print();

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee(
                "Ivanov", "Ivan ", "Ivanovich",
                "Engineer", "ivivan@mailbox.com", 892312312L, 53000, 30);
        employeesArray[1] = new Employee();
        employeesArray[2] = new Employee();
        employeesArray[3] = new Employee();
        employeesArray[4] = new Employee();
    }


}

