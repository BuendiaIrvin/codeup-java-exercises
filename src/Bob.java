import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Would you like to have a conversation with Bob?");
        String userInput = scanner.nextLine();
        if (userInput.endsWith("?")) {
            System.out.println("Sure?");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        }
    }
}
