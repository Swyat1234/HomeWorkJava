package Work140223;

import java.util.*;

public class SpeedTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        long amount = 10000000L;


        long before = System.currentTimeMillis();
        fillList(arrayList, amount);
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        long beforeLinkedList = System.currentTimeMillis();
        fillLinkedList(linkedList, amount);
        long afterLinkedList = System.currentTimeMillis();
        System.out.println(afterLinkedList - beforeLinkedList);

        long beforeTreeSet = System.currentTimeMillis();
        fillTreeSet(treeSet,amount);
        long afterTreeSet = System.currentTimeMillis();
        System.out.println(afterTreeSet - beforeTreeSet);

        long beforeHashSet = System.currentTimeMillis();
        fillHashSet(hashSet,amount);
        long afterHashSet = System.currentTimeMillis();
        System.out.println(afterHashSet - beforeHashSet);
    }

    private static void fillList(List<Integer> list, long amount) {
        for (int i = 0; i < amount; i++) {
            list.add(i, 1);
        }
    }

    private static void fillLinkedList(LinkedList<Integer> linkedList, long amount) {
        for (int i = 0; i < amount; i++) {
            linkedList.add(i, 1);
        }
    }

    private static void fillTreeSet(TreeSet<Integer> treeSet, long amount) {
        for (int i = 0; i < amount; i++) {
            treeSet.add(1);
        }
    }

    private static void fillHashSet(HashSet<Integer> hashSet, long amount) {
        for (int i = 0; i < amount; i++){
            hashSet.add(1);
        }
    }

}
