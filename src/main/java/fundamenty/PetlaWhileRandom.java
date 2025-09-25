package fundamenty;

import java.util.Random;

public class PetlaWhileRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(11);
        System.out.println("count wylosowało: " + count);
        int counter = 0;
        while(counter < count){
            System.out.println(counter);
            counter = counter +1;

        }
    }
}
