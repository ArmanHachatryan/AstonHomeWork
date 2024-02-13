package org.aston.exercise.pages.base;

import org.aston.exercise.utils.common.Singlton;
import org.junit.jupiter.api.Assertions;

public class BasePage {
    public static void open(String url) {
        Singlton.getInstance().get(url);
    }

    public static void goBack() {
        Singlton.getInstance().navigate().back();
    }
}
