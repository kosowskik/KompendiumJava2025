package fundamenty;

public class Tablice {

    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[3];
        int[] numbers2 = new int[5];

        numbers[0] = 3;
        numbers[1] = 7;
        numbers[2] = 9;

        System.out.println(number);
        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("Liczby podane to: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);

        int counter = 0;
        while(counter < numbers.length){
            System.out.println(numbers[counter]);
            counter++;
            System.out.println("Counter: " + counter);
        }

    }

}
