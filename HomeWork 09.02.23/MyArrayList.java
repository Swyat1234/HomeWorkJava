package Work090223;

import java.util.ListIterator;
import java.util.*;

public class MyArrayList implements List<Integer> {
    private int size;
    private Node first;
    private Node second;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<Integer> iterator = iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer currentValue) {
        Node currentNode = new Node(currentValue);
        if (this.first == null) {
            this.first = currentNode;
            this.second = currentNode;
        } else {
            currentNode.setPrev(this.second);
            this.second.setNext(currentNode);
            this.second = currentNode;
        }
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer i:c){
        add(i);
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        second = null;
    }

    @Override
    public Integer get(int index) {
        return findNode(index).getValue();
    }

    private Node findNode(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node currentNode = first;
        while (index != currentIndex) {
            currentIndex++;
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public Integer set(int index, Integer newValue) {
        Node indexNode = findNode(index);
        Integer prevValue = indexNode.getValue();
        indexNode.setValue(newValue);
        return prevValue;
    }

    @Override
    public void add(int index, Integer newValue) {
        Node newNode = new Node(newValue);
        Node prevNode = findNode(index);
        newNode.setPrev(prevNode.getPrev());
        newNode.setNext(prevNode);
        prevNode.setPrev(newNode);
        if (newNode.getPrev() != null) {
            prevNode.getPrev().setNext(newNode);
        } else {
            this.first = newNode;
        }
        size++;
    }

    @Override
    public Integer remove(int index) {
        Node nodeToDelete = findNode(index);
        Integer removedValue = nodeToDelete.getValue();
        Node prevNode = nodeToDelete.getPrev();
        Node nextNode = nodeToDelete.getNext();
        if (prevNode != null) {
            prevNode.setNext(nextNode);
        } else {
            this.first = nextNode;
        }

        if (nextNode != null) {
            nextNode.setNext(prevNode);
        } else {
            this.first = prevNode;
        }

        nodeToDelete.setPrev(null);
        nodeToDelete.setNext(null);
        size--;
        return removedValue;
    }

    @Override
    public int indexOf(Object o) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                remove(index);
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node x = second; x != null; x = x.getPrev()) {
                index--;
                if (x.getValue() == null)
                    return index;
            }
        } else {
            for (Node x = second; x != null; x = x.getPrev()) {
                index--;
                if (o.equals(x.getValue()))
                    return index;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        Node x = findNode(index);
        return (ListIterator<Integer>) new Work090223.ListIterator(x);
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

}
