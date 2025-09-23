package fundamenty;

public class ForEach2 {

    public static void main(String[] args) {
        int[] numbers = {43, 12, 13, 444};
        for(int i = 0; i <numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("for each iteration");
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
