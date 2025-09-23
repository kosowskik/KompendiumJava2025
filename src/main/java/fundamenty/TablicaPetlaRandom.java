package fundamenty;

import java.util.Random;

public class TablicaPetlaRandom {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[300];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1, 11);
            System.out.println(numbers[i]);

        }
    }
}


