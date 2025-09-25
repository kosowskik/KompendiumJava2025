package fundamenty;

import java.util.Scanner;

public class DoWhile {

        public static void main(String[] args) {
            int psw = 1234;
            Scanner scan = new Scanner(System.in);
            int userTry;
            do{
                System.out.println("wprowadź hasło");
                userTry = scan.nextInt();
            }while(psw != userTry);
            System.out.println("secret");
        }
}
