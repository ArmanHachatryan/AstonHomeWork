package ru.aston.lessons;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private String[] header;
    private int[][] data;
    private String[][] strData;

    public Writer(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
        convertArrayToString();
    }

    private void convertArrayToString() {
        int N = data.length;
        strData = new String[N][data[0].length];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < data[i].length; j++) {
                strData[i][j] = String.valueOf(data[i][j]);
            }
        }
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.join(";", header));
            writer.append("\n");

            for (var row : strData) {
                writer.write(String.join(";", row));
                writer.append("\n");
            }

            System.out.println("Файл записан");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
