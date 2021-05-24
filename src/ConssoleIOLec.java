import java.util.Scanner;

public class ConssoleIOLec {
    public static void main(String[] args) {
        System.out.println("Hello, world!");


        String name = "Irvin";
        System.out.printf("Hello, %s%n", name);

        System.out.format("%d is %s's favorite number\nThis is a %b statement%n", 9, name, true);
        System.out.println("I'm on a new line.");

        System.out.println("Hello, " + name + " this is java");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend, how is it going?");
        String userInput = scanner.nextLine();

        System.out.printf("Youre feeling: %s%n", userInput);






    }
}
