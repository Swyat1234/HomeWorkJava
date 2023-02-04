import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        boolean sorted = false;
        int change;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    sorted = false;
                    change = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = change;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
