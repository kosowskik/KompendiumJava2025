import java.util.Random;

public class StringDemo {

    public static void main(String[] args) {
        String[] napisy = {"czesc", "hej", "witam"};
        Random random = new Random();
        System.out.println(napisy[random.nextInt(napisy.length)]);
    }
}
