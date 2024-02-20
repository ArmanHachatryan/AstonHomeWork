package org.aston.exercise;

import org.aston.exercise.baseTest.BaseTest;
import org.aston.exercise.pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorFunctionTest extends BaseTest {
    protected MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    @DataProvider
    public String[][] Expressions() {
        return new String[][] {
                {"3 + 9 + 0", "12"},
                {"5 - 5 + 9", "9"},
                {"2 * 2", "4"},
                {"6 / 3", "2"},
        };
    }

    @Test(dataProvider = "Expressions")
    public void checkBaseOperations(String expression, String expectedResult) {
        String actualResult = mainPage.enterExpression(expression).getResult();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
