package util;

import OopLecture.UserTools;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
//    public static Scanner scanner = new Scanner(System.in);


    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userChoice = this.scanner.nextLine();
        return userChoice.trim().equalsIgnoreCase("y") || userChoice.trim().equalsIgnoreCase("yes");
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) && (userNumber < min)) {
            System.out.println("Try again!");
            return getInt(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        double userNumber = this.scanner.nextDouble();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getDouble(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }


}

