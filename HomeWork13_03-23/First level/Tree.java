package HomeWork13_03_23;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Tree<T> {
    private Node<T> root;

    public Tree() {
    }
    public void printDfs() {
        Stack<T> nodeStack = new Stack<>();
        nodeStack.add((T) root);

        while (!nodeStack.isEmpty()) {
            Node <T> currentNode = (Node<T>) nodeStack.pop();
            if (currentNode.left != null) {
                nodeStack.add((T) currentNode.left);
            }
            if (currentNode.right != null) {
                nodeStack.add((T) currentNode.right);
            }
            System.out.println(currentNode.key);
        }
    }

    public void printBfs() {
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> currentNode = queue.poll();
            System.out.println(currentNode.key);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

        }
    }


    public boolean add(int value) {
        Node<T> currentNode = new Node<T>();
        currentNode.key = value;
        if (root == null) {
            root = currentNode;
            return true;
        } else {
            Node<T> comparingNode = root;
            while (comparingNode != null) {
                if (comparingNode.key < value) {
                    if (comparingNode.right == null) {
                        comparingNode.right = currentNode;
                        return true;
                    }
                    currentNode.right = currentNode;
                    comparingNode = currentNode.right;
                } else if (comparingNode.key > value) {
                    if (comparingNode.left == null) {
                        comparingNode.left = currentNode;
                        return true;
                    }
                    comparingNode.left = currentNode;
                    comparingNode = comparingNode.left;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static class Node<T> {
        private Node<T> left;
        private Node<T> right;
        private int key;

    }
}
