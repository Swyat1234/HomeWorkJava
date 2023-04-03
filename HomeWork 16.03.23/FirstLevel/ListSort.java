package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;

public class ListSort {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Ten");
        stringList.add("Nine");
        stringList.add("Seven");
        stringList.add("Six");
        stringList.add("Five");
        stringList.add("Four");
        stringList.add("Three");
        stringList.add("Two");
        BiConsumer<List<String>,Comparator<String>> sort = Collections::sort;
        sort.accept(stringList,String::compareTo);
        System.out.println(stringList);
    }
}
