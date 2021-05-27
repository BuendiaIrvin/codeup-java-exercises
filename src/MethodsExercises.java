import java.util.Random;

import java.util.Scanner;

public class MethodsExercises {

    public static void addition(int x, int y) {
        System.out.println(x + y);
    }

    public static void subtraction(int x, int y) {
        System.out.println(x - y);
    }

    public static void multiplication(int x, int y) {
        System.out.println(x * y);
    }
    public static void division(int x, int y) {
        System.out.println(x/y);
    }
    public static void modulus(int x, int y) {
        System.out.println(x%y);
    }

    public static void multiplierLoop(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < a; i++) {
            resultat += b;
        }

        System.out.println(resultat);
    }



    public static int getInteger(int min, int max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }

    public static int getFactorial() {
        int n, c, fact = 1;

        System.out.printf("Give me a number between %d and %d\n", 1, 10);
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0) {
            System.out.println("Number should be non-negative.");
            return n;
        } else {
            for (c = 1; c <= n; c++)
                fact = fact * c;

            System.out.println("Factorial of " + n + " is = " + fact);
            return n;
        }
    }

public static void diceRoll() {
    System.out.println("how many sides on this die?");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
        Random r = new Random();
        int result = r.nextInt(x);
        result++;

    System.out.println("You rolled a " + result);
    }

    public static void main(String[] args) {
    addition(10,15);
    subtraction(30, 5);
    multiplication(5, 5);
    division(100, 4);
    modulus(35, 15);
    multiplierLoop(5,5);
    getInteger(1,20);
    getFactorial();
    diceRoll();

    }
}
