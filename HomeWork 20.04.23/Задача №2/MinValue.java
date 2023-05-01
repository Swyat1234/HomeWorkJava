package HomeWork20_04_23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinValue {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println(findMin(stringList));
    }
    public static String findMin(List<String> stringList){
        return stringList.stream()
                .min(Comparator.naturalOrder())
                .get();
    }
}
