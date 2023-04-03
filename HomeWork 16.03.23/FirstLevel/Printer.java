package Homework;

import java.util.function.Function;

public class StringFunctions {
    public static void main(String[] args) {
        String str = "Строка ";
        Function<String ,String> function = s -> s + "Test";
        function.andThen(s -> s.substring(0,3)).andThen(s -> s + " .").apply(str);

    }
}
