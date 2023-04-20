package HomeWork18_04;

import java.util.function.BiFunction;

public class Number2 {
    public static void main(String[] args) {
        getFactorial(5);
    }

    private static void getFactorial(int number) {
        int factorial = number;

        for(int i = (number - 1); i > 1; i--) {
            BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction = (factorial1, i1) -> {
                factorial1 = factorial1 * i1;
                return factorial1;
            };
            factorial = integerIntegerIntegerBiFunction.apply(factorial, i);
        }
        System.out.println("Факториал " + number + " это " + factorial);
    }
}
