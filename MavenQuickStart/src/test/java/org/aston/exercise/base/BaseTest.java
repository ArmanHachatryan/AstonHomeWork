package org.aston.exercise.base;

import org.aston.exercise.utils.common.Singlton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.aston.exercise.utils.common.Config.QUIT_BROWSER;

public class BaseTest {
    @AfterEach
    public void close() {
        if (QUIT_BROWSER) {
            Singlton.getInstance().quit();
        }
    }
}
