package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        String testString = "Hello World!";

        //Використовуючи анонімний клас, створємо об'єкт інтерфейсу MathOperation, який виконує операцію додавання.
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = addition.operate(5, 3);
        System.out.println("Результат додавання: " + result);


        //Створюємо лямбда-вираз, який реалізує функціональний інтерфейс StringManipulator і перетворює вхідний рядок в верхній регістр.
        StringManipulator toUpperCase = (s) -> {
            System.out.println(s.toUpperCase());
        };

        toUpperCase.manipulate(testString);




        //Використовуємо посилання на методи, щоб передати метод countUppercase як аргумент функції Function<String, Integer>.
        Function<String, Integer> countUppercaseFunction = StringListProcessor::countUppercase;

        int uppercaseCount = countUppercaseFunction.apply(testString);

        System.out.println("Кількість великих літер у рядку \"" + testString + "\": " + uppercaseCount);


        // Використовуємо інтерфейс Supplier<T> для створення постачальника, який буде генерувати випадкове число від 1 до 100.
        Supplier<Integer> randomIntegerSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Випадкове число: " + randomIntegerSupplier.get());
    }
}
