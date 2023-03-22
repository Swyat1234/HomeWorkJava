package HomeWork_15_03_23;

public class SquareFunction {
    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public int apply(int x) {
                return x * x;
            }
        };
        for (int i = 0; i < 10 ; i++) {
            System.out.println(function.apply(i));
        }
    }
}
