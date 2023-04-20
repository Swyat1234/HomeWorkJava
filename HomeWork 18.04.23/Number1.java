package HomeWork18_04;

import java.util.function.Function;

public class Number1 {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = s -> ((s * 10) + 1) + 3;
        Function<Integer,Integer> function2 = d -> d * 10;
        System.out.println(function1.andThen(function2).apply(3));
    }
}
