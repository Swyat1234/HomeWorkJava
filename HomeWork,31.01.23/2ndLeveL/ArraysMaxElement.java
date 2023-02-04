import java.util.Scanner;

public class ArraysMaxElement {
    public static void main(String[] args) {
        int [][] array = new int[2][2];
        int arrayMax = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.println("Введите числа массива");
                array[i][j] = scanner.nextInt();
                if(array[i][j] % 2 == 0 ) {
                    if (arrayMax < array[i][j]) {
                        arrayMax = array[i][j];
                    }
                }
            }
        }
        System.out.println("Максимальное число : " + arrayMax);
    }
}
