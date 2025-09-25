package Atm;

import java.util.Scanner;

public class AtmHelper {
    private final int CORRECT_PIN = 1234;
    private int accountBalance = 2000;
    private int atmBalance = 10_000;

    Scanner scan = new Scanner(System.in);

    public void enterPin() {
        int pin;
        do {
            System.out.println("Enter your PIN number");
            pin = scan.nextInt();
        } while (pin != CORRECT_PIN);
        System.out.println("Welcome to your bank account");
    }

    public void chooseOption() {
        System.out.println("Choose, what you want to do: ");
        System.out.println("1. Take money");
        System.out.println("2. Log out");
        int optiontoChoose = scan.nextInt();
        if (optiontoChoose == 1) {
            System.out.println("Choose option: ");
            System.out.println("1. default money");
            System.out.println("2. Choose amount you need");
            takeAmountOfMoney(scan.nextInt());
        } else if (optiontoChoose == 2) {
            System.out.println("You've been logged out");
            //enterPin();
            //chooseOption();
        } else {
            System.out.println("Incorrect data");
            chooseOption();
        }

    }

    public void takeAmountOfMoney(int option) {

        System.out.println();
        if (option == 1) {
            System.out.println("Sure to take the money?");
        } else if (option == 2) {
            System.out.println("Choose the amount that you want to pick");
            int amount = scan.nextInt();
            if (amount > accountBalance) {
                System.out.println("Not enough money. try again");
                chooseOption();
            } else if (amount > atmBalance) {
                System.out.println("This ATM doesn't have enough money. Try again or find different ATM");
                chooseOption();
            } else {
                accountBalance -= amount;
                atmBalance -= amount;
                System.out.println(accountBalance);
                System.out.println(atmBalance);
                chooseOption();
            }
        }
    }


}
