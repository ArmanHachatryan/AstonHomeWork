package ru.aston.lessons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "demo.csv";

        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{600, 4, 13}, {4, 2, 96}};

        Writer writer = new Writer(headers, data);
        writer.save(fileName);

        Reader.read(fileName);
    }
}