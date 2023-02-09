package HomeWork020223;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        fillList(list);
        sort(list);
        System.out.println(list);
    }

    private static void sort(List<Integer> list) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    int temp = list.get(i);
                    list.set(list.get(i), list.get(i - 1));
                    list.set(list.get(i - 1), temp);
                    isSorted = false;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
    private static void fillList(List<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            Random random = new Random();
            list.add(i, random.nextInt() * 10 );
        }
    }
}
