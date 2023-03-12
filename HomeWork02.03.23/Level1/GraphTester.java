package HomeWork02_03_23;

public class GraphTester {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.add('а','б');
        graph.add('а','в');
        graph.add('а','г');
        graph.add('а','д');
        graph.add('б','в');
        graph.add('б','е');
        graph.add('в','ж');
        graph.add('г','в');
        graph.add('г','з');
        graph.add('д','г');
        graph.add('д','и');
        graph.add('е','к');
        graph.add('ж','к');
        graph.add('ж','з');
        graph.add('з','к');
        graph.add('и','к');
        graph.print();

        //Решите на бумаге следующую задачу (не надо кодить ее), найти кратчайший маршрут из Рейкявика в Афины
        //Кратчайший маршрут - Reykjavik -> Oslo -> Moscow -> Athens.

    }
}
