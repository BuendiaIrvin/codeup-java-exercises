import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

//        System.out.format("The value of pi is approximately " + pi);
//        System.out.println();
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a whole number");
//        Integer userInput = scanner.nextInt();
//
//        System.out.printf("You're number is: %d%n", userInput);
//
//        System.out.println("Enter your first word");
//        String wordOne = scanner.next();
//
//        System.out.println("Enter your second word");
//        String wordTwo = scanner.next();
//
//        System.out.println("Enter your third word");
//        String wordThree = scanner.next();
//
//        System.out.printf("You're first word is " + wordOne + " you're second word is " + wordTwo + " you're last word is " + wordThree);
//        System.out.println("Enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

        System.out.println("Give me the length.");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("Give me the width.");
        int width = Integer.parseInt(scanner.nextLine());


        System.out.println("The area is " + length * width);
        System.out.println("The perimeter is " + ((length * 2) + (width * 2)));

    }
}
