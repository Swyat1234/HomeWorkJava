package HomeWork210223;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class SpeedTest {
    public static void main(String[] args) {
        int amount = 1000000;
        Stack<String> stringStack = new Stack<>();
        Deque<String> linkedListDeque = new LinkedList<>();
        Deque<String> arrayListDeque = new ArrayDeque<>();

        TimeCheckPushStack(amount, stringStack);

        TimeCheckPushDeque(amount, linkedListDeque);

        TimeCheckPushDeque(amount, arrayListDeque);

        TimeCheckPollDeque(amount, arrayListDeque);

        TimeCheckPollDeque(amount, linkedListDeque);


    }

    private static void TimeCheckPushStack(int amount, Stack<String> stringStack) {
        long before = System.currentTimeMillis();
        fillStack(stringStack, amount);
        long after = System.currentTimeMillis();
        System.out.println(after - before + " push Stack");
    }

    private static void TimeCheckPushDeque(int amount, Deque<String> arrayListDeque) {
        long beforeArrayList = System.currentTimeMillis();
        fillDeque(arrayListDeque, amount);
        long afterArrayList = System.currentTimeMillis();
        System.out.println(afterArrayList - beforeArrayList + "  push ArrayList");
    }

    private static void TimeCheckPollDeque(int amount, Deque<String> linkedListDeque) {
        long beforePollLinkedList = System.currentTimeMillis();
        poolDeque(linkedListDeque, amount);
        long afterPollLinkedList = System.currentTimeMillis();
        System.out.println(afterPollLinkedList - beforePollLinkedList + "  pool LinkedList");
    }

    private static void fillStack(Stack<String> stack, int amount) {
        for (int i = 0; i < amount; i++) {
            stack.push(null);
        }
    }

    private static void fillDeque(Deque<String> deque, int amount) {
        for (int i = 0; i < amount; i++) {
            deque.push("null");
        }
    }

    private static void poolDeque(Deque<String> pollDeque, int amount) {
        for (int i = 0; i < amount; i++) {
            pollDeque.poll();
        }
    }
}