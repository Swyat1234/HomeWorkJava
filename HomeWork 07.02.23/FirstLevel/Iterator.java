package HomeWork070223;

import java.util.Arrays;

public class Iterator implements java.util.Iterator<Integer> {
private int [] arrayValue;
private int position;

    public Iterator(int[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Iterator iterator = new Iterator(array);
        System.out.println(iterator);

    }

    @Override
    public boolean hasNext() {
        return position < arrayValue[position];
    }

    @Override
    public Integer next() {
        return arrayValue[position];
    }

    @Override
    public String toString() {
        return "Iterator{" +
                "arrayValue=" + Arrays.toString(arrayValue) +
                ", position=" + position +
                '}';
    }
}
