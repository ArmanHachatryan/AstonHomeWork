package org.aston.exercise;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest
{
    @DisplayName("Проверка вычисления факториала чисел")
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "5, 120",
    })
    public void checkFactorial(int argument, long expected) {
        Assertions.assertEquals(expected, App.calcFactorial(argument));
    }
}
