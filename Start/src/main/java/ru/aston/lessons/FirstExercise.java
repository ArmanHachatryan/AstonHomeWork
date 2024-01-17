package ru.aston.lessons;

import java.util.Arrays;

public class FirstExercise {
    public static long countEven(int[] nums) {
        return Arrays.stream(nums).filter(n -> n % 2 == 0).count();
    }
}
