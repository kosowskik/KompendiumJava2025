package zadania;

import java.util.Random;
import java.util.Scanner;

public class LottoZadanie {

    public static void main(String[] args) {
        int[] wprowadzone = new int[6];
        int[] wylosowane = new int[6];

        for (int i = 0; i < wprowadzone.length; i++) {
            System.out.println("wprowadz liczbe");
            Scanner scanner = new Scanner(System.in);
            wprowadzone[i] = scanner.nextInt();
            if(wprowadzone[i] > 24 || wprowadzone[i] < 1){
                i--;
                System.out.println("niepoprawna liczba, spróbuj ponownie");
            }
        }
        System.out.print("Wprowadzone liczby: ");
        for (int number : wprowadzone){
            System.out.print(number + ", ");
        }

        for(int i = 0; i < wylosowane.length; i++){
            Random random = new Random();
            wylosowane[i] = random.nextInt(1, 25);
        }
        System.out.println();
        String komunikat = "Wylosowane liczby: ";
        for(int wylosowany : wylosowane){
            komunikat +=wylosowany + ", ";
        }
        System.out.println(komunikat.substring(0,komunikat.length() -2));

        int counter = 0;
        for (int wyl : wylosowane){
            for (int wpr : wprowadzone){
                if(wyl == wpr){
                    counter++;
                }
            }
        }
        System.out.println();
        System.out.println("Trafienia: " + counter);

        int[] nagrody = new int[] {0, 0, 0, 16, 200, 4000, 1500000};
        System.out.println("Nagroda wynosi: " + nagrody[counter] + "zł");
    }
}
