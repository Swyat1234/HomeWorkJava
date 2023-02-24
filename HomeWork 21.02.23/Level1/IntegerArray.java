package HomeWork210223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntegerArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("Лист с дубликатами: " + list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("Лист без дубликатов: " + newList);

    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}

