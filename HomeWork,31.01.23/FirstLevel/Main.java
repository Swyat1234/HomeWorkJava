import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random random = new Random();
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                for (int k = 0; k < array.length; k++) {
                    max = Math.max(max, array[i][j]);
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
            System.out.println("Маскимальный эллемент диагонали: " + max);
        }

        int[][] array1 = new int[10][10];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array[i][j] = random.nextInt(100);
                array1[i][j] = 7 * i - 3 * j;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(" ");
        }

        int[][] array2 = new int[8][8];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                if ((i + j) % 2 == 0){
                    array2[i][j] = 1;
                }else
                    array[i][j] = 0;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(" ");
            }
        }
    }
