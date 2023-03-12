package HomeWork10_03_23;

import java.util.Arrays;
import java.util.Random;

public class Earthquake {
    public static void main(String[] args) {
        Random random = new Random();
        int signalData = 97;
        int count = 0;
        int[] impulse = new int[100];
        int sum = 0;

        for (int i = 0; i < impulse.length; i++) {
            for (int i1 : impulse) {
                sum += i1;
                impulse[i] = random.nextInt(10);
            }
            if (impulse[i] > 3) {
                count++;
                if (count % 5 == 0) {
                    System.out.println("Больше 5ти толчков выше 3х баллов");
                }
            }
            sum = signalData;
        }
        System.out.println(Arrays.toString(impulse));
        System.out.println(count);

    }

}


