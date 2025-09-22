import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        //24.9 nadwaga
        //18.5 niedowaga

        double wzrost;
        double waga;

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź wagę");
        waga = input.nextDouble();
        System.out.println("Wprowadź wzrost");
        wzrost = input.nextDouble();

        double bmi = waga/(wzrost*wzrost);


        System.out.println("wprowadzona waga = " + waga);
        System.out.println("wprowadzony wzrost = " + wzrost);
        System.out.println("otrzymane BMI = " + bmi);

        if(bmi >= 24.9){
            System.out.println("masz nadwagę");
        }else if (bmi <= 18.5){
            System.out.println("masz niedowagę");
        }else{
            System.out.println("waga prawidłowa");
        }





    }
}
