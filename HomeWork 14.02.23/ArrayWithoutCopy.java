package Work140223;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayWithoutCopy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(0, 2);
        arrayList1.add(0, 2);
        arrayList1.add(0, 2);
        arrayList1.add(0, 4);
        arrayList1.add(0, 6);
        arrayList1.add(0, 1);
        arrayList1.add(0, 10);
        Set<Integer> array = new HashSet<>(arrayList1);
        System.out.println(array);

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(5);
        Set<Integer> array2 = new HashSet<>(arrayList2);
        System.out.println(array2);
    }
}
