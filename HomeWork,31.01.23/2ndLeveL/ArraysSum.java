import java.util.Arrays;
import java.util.Random;


public class ArraysSum {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(100);
                for (int k = 0; k < array1.length; k++) {
                    for (int l = 0; l < array1[k].length; l++) {
                        array1[k][l] = random.nextInt(100);
                    }
                }
            }

            System.out.println(Arrays.deepToString(sum(array1, array2)));
        }
    }

    static int[][] sum(int matrix1[][], int matrix2[][]) {
        int[][] sum = new int[5][5];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                for (int k = 0; k < matrix2.length; k++) {
                    for (int l = 0; l < matrix2[k].length; l++) {
                        sum[i][j] = matrix1[i][j] + matrix2[k][l];
                    }
                }
        return sum;
    }
}

