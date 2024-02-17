package org.aston.exercise.pages;

import org.aston.exercise.pages.basePage.BasePage;

public class MainPage extends BasePage {
    private static final String idDigitLocator = "com.google.android.calculator:id/digit_";
    private static final String idOperationLocator = "com.google.android.calculator:id/";

    public MainPage enterExpressionWith2Args(String expression) {
        String[] expr = expression.split(" ");
        driver.findElementById(idDigitLocator + expr[0]).click();
        clickOperation(expr[1]);
        driver.findElementById(idDigitLocator + expr[2]).click();
        driver.findElementById(idOperationLocator + "eq").click();
        return this;
    }

    public String getResult() {
        return driver.findElementById(idOperationLocator + "result_final").getText();
    }

    private void clickOperation(String operation) {
        switch (operation) {
            case "+":
                driver.findElementById(idOperationLocator + "op_add").click();
                break;
            case "-":
                driver.findElementById(idOperationLocator + "op_sub").click();
                break;
            case "*":
                driver.findElementById(idOperationLocator + "op_mul").click();
                break;
            case "/":
                driver.findElementById(idOperationLocator + "op_div").click();
                break;
        }
    }
}
