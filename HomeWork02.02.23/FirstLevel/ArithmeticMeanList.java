package HomeWork020223;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticMeanList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(5);

        fillList(scanner, list);
        System.out.println(list);
        getAveregeMean(list);

    }

    private static void getAveregeMean(List<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
            double mean = sum/5;
            System.out.println(mean);
        }
    }

    private static void fillList(Scanner scanner, List<Integer> list) {
        for(int i = 0; i < 5; i++){
            list.add(i, scanner.nextInt());
        }
    }

}
