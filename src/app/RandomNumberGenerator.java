package app;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Мінімальне значення не може бути більше максимального.");
        }

        Random random = new Random();
        return random.nextInt(min, max + 1);
    }
}
