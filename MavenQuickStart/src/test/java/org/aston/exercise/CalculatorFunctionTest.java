package org.aston.exercise;

import org.aston.exercise.baseTest.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorFunctionTest extends BaseTest {
    @ParameterizedTest
    @DisplayName("Проверить базовые операции калькулятора")
    @CsvSource({"3 + 9 + 0, 12", "5 - 5 + 9, 9", "2 * 2, 4", "6 / 3, 2"})
    public void checkBaseOperations(String expression, String expectedResult) {
        String actualResult = mainPage.enterExpression(expression).getResult();
        assertEquals(expectedResult, actualResult);
    }
}
