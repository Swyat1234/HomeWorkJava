package HomeWork220223;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ValueList1000 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer val = integerIntegerMap.get(list.get(i));
            list.add(ThreadLocalRandom.current().nextInt(100));
            if (val == null) {
                integerIntegerMap.put(list.get(i), 1);
            } else {
                integerIntegerMap.put(list.get(i), val + 1);
            }
        }
        for (Integer s: integerIntegerMap.keySet()) {
            System.out.println(s + " Эти числа совпали ");
        }
    }


}

