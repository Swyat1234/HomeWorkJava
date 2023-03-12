package HomeWork02_03_23;

import java.util.*;

public class Graph {
    Map<Character, List<Character>> nodes = new TreeMap<>();

    public void print() {
        for (Character key : nodes.keySet()) {
            List<Character> connectedNodes = nodes.get(key);
            for (Character connectedNode : connectedNodes) {
                System.out.printf("%s -> %s%n", key, connectedNode);
            }
        }
    }

    public class Node {
        private int value;
        private List<Edge> edges;
    }

    public class Edge {
        private Node from;
        private Node to;
        private int weight;
    }

    public void add(Character from, Character to) {
        List<Character> connectedNodes = nodes.get(from);
        if (connectedNodes == null) {
            connectedNodes = new ArrayList<>();
            nodes.put(from, connectedNodes);
        }
        connectedNodes.add(to);
        if (to != from) {
            if (nodes.get(from) == nodes.get(to)) {
                List<Character> connectedNodes2 = nodes.get(to);
                if (connectedNodes2 == null) {
                    connectedNodes2 = new ArrayList<>();
                    nodes.put(to, connectedNodes2);
                }
                connectedNodes2.add(from);
            }
        }
    }
}