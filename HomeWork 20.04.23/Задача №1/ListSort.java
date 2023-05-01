package HomeWork20_04_23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<String> reversList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversList);
    }
}
