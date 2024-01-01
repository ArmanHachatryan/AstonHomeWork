package ru.aston.lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private Reader() {
    }

    public static void read(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

            System.out.println("Файл прочитан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
