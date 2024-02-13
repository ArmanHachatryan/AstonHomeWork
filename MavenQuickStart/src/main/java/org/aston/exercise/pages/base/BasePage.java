package org.aston.exercise.pages.base;

import org.aston.exercise.utils.common.Singlton;

public class BasePage {
    public static void open(String url) {
        Singlton.getInstance().get(url);
    }
}
