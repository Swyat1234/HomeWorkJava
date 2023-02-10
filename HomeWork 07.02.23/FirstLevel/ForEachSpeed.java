package HomeWork070223;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ForEachSpeed {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int m = 10000000;
        for (int i = 0; i < m; i++) {
            list.add(i, random.nextInt(1000));
        }


        Iterator<Integer> iterator = list.iterator();

        long before = System.currentTimeMillis();
        int tempVal = 0;
        for (int i = 0; i < list.size(); i++) {
            tempVal = list.get(i);
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        long beforeForEach = System.currentTimeMillis();
        int tempForEach = 0;
        for (int i : list)
            tempForEach = list.get(i);
        long afterForEach = System.currentTimeMillis();
        System.out.println(afterForEach - beforeForEach);

        long beforeReverse = System.currentTimeMillis();
        int tempReverseFor = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            tempReverseFor = list.get(i);
        }
        long afterReverse = System.currentTimeMillis();
        System.out.println(afterReverse - beforeReverse);

        long beforeIter = System.currentTimeMillis();
        iterator.next();
        long afterIter = System.currentTimeMillis();
        System.out.println(afterIter - beforeIter);
    }
}
