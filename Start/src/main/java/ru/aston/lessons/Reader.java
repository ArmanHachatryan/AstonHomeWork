package ru.aston.lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Reader {

    private Reader() {
    }

    public static void read(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = reader.readLine()) != null) {
                Stream<String> ms = Stream.of(str);
                ms.flatMap(p -> Stream.of(
                        String.format("%-8s | %-8s | %-8s |", p.split(";")[0], p.split(";")[1], p.split(";")[2])
                )).forEach(s -> System.out.println(s + "\n" + "_______________________________"));
            }
            System.out.println("Файл прочитан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
