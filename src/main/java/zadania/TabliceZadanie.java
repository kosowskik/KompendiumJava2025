package zadania;

import java.util.Random;
import java.util.Scanner;

public class TabliceZadanie {

    public static void main(String[] args) {
        Random random = new Random();
        int randomSize = random.nextInt(3,5);
        System.out.println(randomSize);

        Scanner scan = new Scanner(System.in);

        String[] notes = new String[randomSize];
        System.out.println(notes.length);
        for(int i = 0; i < notes.length; i++){
            System.out.println("wprowadz notatke");
            notes[i] = scan.nextLine();
        }

        for(int i = 0; i< notes.length; i++){
            System.out.println("Notatka: " + notes[i]);
        }

    }

}
