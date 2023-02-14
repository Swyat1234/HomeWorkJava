package Work090223;

import java.util.Iterator;

public class ListIterator implements Iterator<Integer> {
    private Node currentNode;

    public ListIterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Integer next() {
        Integer value = currentNode.getValue();
        currentNode = currentNode.getNext();
        return value;
    }
}
