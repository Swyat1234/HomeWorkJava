package HomeWork020223;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MillionElementsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        final int amount = 1000000;
        final int chooseAmount = 100000;
        fillList(list,amount);
        fillLinkedList(linkedList,amount);
        timeCheck(list, linkedList, amount, chooseAmount);
    }

    private static void timeCheck(List<Integer> list, LinkedList<Integer> linkedList, int amount, int chooseAmount) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < chooseAmount; i++) {
            list.get((int) (Math.random() * (amount - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < chooseAmount; i++) {
            linkedList.get((int) (Math.random() * (amount - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static void fillList(List<Integer> list, int amount) {
        for (int i = 0; i < amount; i++){
            list.add((int) Math.random());
        }
    }
    private static void fillLinkedList(LinkedList<Integer> linkedList, int amount) {
        for (int i = 0; i < amount; i++){
            linkedList.add((int) Math.random());
        }
    }
}


