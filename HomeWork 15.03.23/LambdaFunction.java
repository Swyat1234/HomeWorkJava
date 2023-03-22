package HomeWork_15_03_23;

public class LambdaFunction {
    public static void main(String[] args) {
        Function function = (int x) -> (int) ((Math.pow(x, 2)) - (8 * x) - 12);
        Function function1 = (int x) -> (int) (5 * (Math.pow(x, 2)) + (3 * x) + 7);

        Function function2 = (int x) -> (int) ((Math.pow(x, 2)) - (6 * x) + 9);

        for (int i = 0; i < 10; i++) {
            System.out.println(function.apply(i) + " Первая функция");
            System.out.println(function1.apply(i) + " Вторая функция");
            System.out.println(function2.apply(i) + " Третья функция");
        }

        FunctionDouble function3 = (double x) -> (Math.pow(x, 2) / 2) - ((2 * x) / 3) - ((x - 2) / 6);
        FunctionDouble function4 = (double x) -> ((Math.pow(x - (1 / x), (0.5)) + Math.pow((1 - (1 / x)), (0.5))));
        FunctionDouble function5 = (double x) -> (Math.sqrt((3 * x) - 1) + Math.pow(1 + x, 2));

        System.out.println(function3.apply(5) + " Функция 3");
        System.out.println(function4.apply(5) + " Функция 4");
        System.out.println(function5.apply(5) + " Функция 5");
    }
}
