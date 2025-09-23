package zadania;

import java.util.Random;
import java.util.Scanner;

public class PetlaZadanie {

    public static void main(String[] args) {
        Random random = new Random();
        int wylosowana = random.nextInt(11);
        System.out.println("Zgadnij liczbę");
        Scanner input = new Scanner(System.in);
        int zgadnietaLiczba = input.nextInt();

        int counter = 0;

        do{
            counter++;
            if(wylosowana != zgadnietaLiczba) {
                if(wylosowana < zgadnietaLiczba){
                    System.out.println("Liczba zbyt wysoka. Spróbuj ponownie");
                } else if(wylosowana < zgadnietaLiczba){
                    System.out.println("Liczba zbyt niska. Spróbuj ponownie");
                }
                System.out.println("Spróbuj ponownie");
                zgadnietaLiczba = input.nextInt();
            }
        }while (wylosowana !=zgadnietaLiczba);
        System.out.println("Wylosowana liczba to: " + wylosowana);
        System.out.println("Poprawna liczba. Zajęło Ci to: " + counter + " prób");
    }
}
