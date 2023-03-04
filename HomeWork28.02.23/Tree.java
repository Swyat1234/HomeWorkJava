package HomeWork280223.Appartement;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
    }
    public void printDfs() {
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.add(root);

        while (!nodeStack.isEmpty()) {
            Node currentNode = nodeStack.pop();
            if (currentNode.left != null) {
                nodeStack.add(currentNode.left);
            }
            if (currentNode.right != null) {
                nodeStack.add(currentNode.right);
            }
            System.out.println(currentNode.key);
        }
    }

    public void printBfs() {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
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
        Node currentNode = new Node();
        currentNode.key = value;
        if (root == null) {
            root = currentNode;
            return true;
        } else {
            Node comparingNode = root;
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

    public static class Node {
        private Node left;
        private Node right;
        private int key;

    }
}
