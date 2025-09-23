package fundamenty;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {
        Random random = new Random();
        double[] numbers = new double[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble();
        }

        double[] smallnumbers = new double[numbers.length];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 0.25) {
                smallnumbers[counter] = numbers[i];
                counter++;
            }
        }
        System.out.println("Znaleziono " + counter + " liczb poniżej 25%");

        for (int i = 0; i < smallnumbers.length; i++) {
            System.out.println(smallnumbers[i]);
        }

        double[] smallNumbersCorrected = new double[counter];
        for (int i = 0; i < counter; i++) {
            smallnumbers[i] = smallNumbersCorrected[i];
        }
        smallnumbers = smallNumbersCorrected;
        for(int i = 0; i <smallnumbers.length; i++){
            System.out.println(smallnumbers[i]);
        }
    }

}
