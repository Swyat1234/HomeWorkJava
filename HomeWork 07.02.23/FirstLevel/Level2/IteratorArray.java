package Level2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class IteratorArray implements Iterator<Integer> {
    private int[][] value;
    private int position;

    public IteratorArray(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return position < value[position][position];
    }

    @Override
    public Integer next() {
        return value[position][position];
    }


    @Override
    public String toString() {
        return "IteratorArray{" +
                "value=" + Arrays.toString(value) +
                ", position=" + position +
                '}';
    }

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random random = new Random();
        IteratorArray iteratorArray = new IteratorArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
            System.out.println(iteratorArray);
        }

    }
}

