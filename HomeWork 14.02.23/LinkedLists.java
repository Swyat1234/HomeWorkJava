package Work140223;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(0,1);
        linkedList1.add(1,3);
        linkedList1.add(2,5);
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(0,1);
        linkedList2.add(1,4);
        linkedList2.add(2,10);
        LinkedList<Integer> numbers = new LinkedList<>(linkedList1);
        numbers.addAll(linkedList2);
        LinkedList<Integer> linkedList3 = new LinkedList<>(numbers);
        Collections.sort(linkedList3);
        System.out.println(linkedList1);
        System.out.println(linkedList2);
        System.out.println(linkedList3);
    }
}
