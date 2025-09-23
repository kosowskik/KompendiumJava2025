import java.util.Scanner;

public class PetleWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int podanaLiczba = scan.nextInt();
        System.out.println("Podano " + podanaLiczba);
        while (podanaLiczba > 10){
            System.out.println("więcej niż 10");
            podanaLiczba = podanaLiczba -1;
            System.out.println(podanaLiczba);
        }
    }

}
