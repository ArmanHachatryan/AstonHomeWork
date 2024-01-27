package org.aston.exercise;

import jdk.jfr.Name;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest {

    @DataProvider(name = "data")
    public Integer[][] data() {
        return new Integer[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
        };
    }

    @Test(dataProvider = "data", testName = "Подсчет факториала")
    public void checkFactorial(int arg, long expected) {
        Assert.assertEquals(expected, App.calcFactorial(arg));
    }
}
