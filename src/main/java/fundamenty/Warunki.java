package fundamenty;

import java.util.Scanner;

public class Warunki {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaka jest temperatura?");
        int temp = scan.nextInt();

        if (temp > 70 || temp < -70) {
            System.out.println("Podano niepoprawną wartość");
            return;
        }
        System.out.println("Podano: " + temp + "C");

        if (temp > 25) {
            System.out.println("Jest gorąco");
        } else if (temp > 15) {
            System.out.println("Temperatura jest ok");
        } else {
            System.out.println("Jest zimno");
        }
        if (temp > 15) {
            System.out.println("Ubierz się normalnie");
        } else if(temp > 10){
            System.out.println("załóż bluzę");
        } else if(temp > 0){
            System.out.println("załóż kurtę");
        } else if(temp > -10){
            System.out.println("załóż czapkę i szalik");
        } else{
            System.out.println("za zimno na dwór");
        }
    }

}
