import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f", pi);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number");
        Integer userInput = scanner.nextInt();

        System.out.printf("You're number is: %d%n", userInput);

        System.out.println("Enter your first word");
        String wordOne = scanner.next();

        System.out.println("Enter your second word");
        String wordTwo = scanner.next();

        System.out.println("Enter your third word");
        String wordThree = scanner.next();

        System.out.println("You're first word is " + wordOne + " you're second word is " + wordTwo + " you're last word is " + wordThree + "%n");


        System.out.println("Enter a sentence");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        System.out.println("Give me the length.");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("Give me the width.");
        int width = Integer.parseInt(scanner.nextLine());


        System.out.println("The area is " + length * width);
        System.out.println("The perimeter is " + ((length * 2) + (width * 2)));

    }
}

// Davids walkthrough
// System.out.format("The value of pi is approximately %.2f%n", pi); // The value of pi is approximately 3.14.
//
//         // 2. Scanner
//         System.out.println("Give me a number:");
//         Scanner scanner = new Scanner(System.in);
//         int userNum = scanner.nextInt();
//         System.out.printf("You entered: %d%n", userNum);
//
//         System.out.println("Give me a word!");
//         String str1 = scanner.next();
//         System.out.println("Another one.");
//         String str2 = scanner.next();
//         System.out.println("Another one.");
//         String str3 = scanner.next();
//
//         System.out.printf("You entered the strings: \"%s\", \"%s\", and \"%s\".%n", str1, str2, str3);
//
//         System.out.println("Give me sentence!");
//         scanner.nextLine();
//         String sentence = scanner.nextLine();
//         System.out.printf("You entered: \"%s\"%n", sentence);
//
//         // Area & Perimeter Calculator
//         System.out.println("Give me a length in meters:");
//         int length = Integer.parseInt(scanner.nextLine());
//         System.out.printf("Length entered: %d meters.%nGive me a width in meters:%n", length);
//         int width = Integer.parseInt(scanner.nextLine());
//         int area = length * width;
//         int perimeter = (2 * width) + (2 * length);
//         System.out.printf("Length entered: %d meters.%nWidth entered: %d meters.%nArea of room: %d meters squared.%nPerimeter of room: %d meters.%n", length, width, area, perimeter);
//         }
//         }
