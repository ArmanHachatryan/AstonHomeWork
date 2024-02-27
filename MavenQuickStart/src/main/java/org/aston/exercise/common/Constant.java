package org.aston.exercise.common;

public class Constant {

    public static class Data {
        public static final int COUNT = 3;
    }

    public static class Config {
        public static final String PLATFORM_AND_BROWSER = "win_chrome";
        public static final boolean QUIT_BROWSER = true;
    }

    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 3;
        public static final int EXPLICIT_WAIT = 11;
    }

    public static class Urls {
        public static final String WILDBERRIES_HOME_PAGE = "https://www.wildberries.ru/";
    }

    public enum Attribute {
        innerText,
    }
}
