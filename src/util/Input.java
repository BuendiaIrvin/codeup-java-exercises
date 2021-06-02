package util;

import OopLecture.UserTools;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);


    // setting up our fields for the User class

    private String string;
    private int x;
    public Double num;
    private boolean yesNo = false;


    public String getString() {
        System.out.println("Enter a sentence");
        string = scanner.nextLine();
        return string;
    }
    public boolean yesNo() {
        System.out.println("Enter Y or yes");
        String userChoice = scanner.nextLine();

        if (userChoice == "y") {
            yesNo = true;
        } else {
            yesNo = false;
        }
        return yesNo;
    }

    public static int getInt(int min, int max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInt(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }

    public static double getDouble(double min, double max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getDouble(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }


}

