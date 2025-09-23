package proceduralne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BibliotekiStatyczne {
    //Arrays, Collections, LocalDate, Math, Character, System, Thread
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.pow(6, 2));

        int[] numbers = new int[10];
        Arrays.fill(numbers, 7);
        System.out.println(Arrays.toString(numbers));

        int[] numbersShort = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(numbersShort));

        char letter = 'a';
        letter++;
        System.out.println(letter);
        if(Character.isDigit(letter)){
            System.out.println("Cyfra");
        } else {
            System.out.println("nie cyfra");
        }

        for(char i ='a'; i <= 'z'; i++){
            System.out.print(i);
        }
    }

}
