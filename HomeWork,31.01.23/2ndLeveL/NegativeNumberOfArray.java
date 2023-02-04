
public class NegativeNumberOfArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        int match = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 15);
            System.out.print(array[i] + " ");
        }

        for (int i = 0;i < array.length;i++){
            if (array[i] < 0){
                match++;
            }
        }
        System.out.println();
        System.out.println("Количество отрицательных чисел : " + match);
    }
}
