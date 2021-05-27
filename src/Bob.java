import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        while (!response.equalsIgnoreCase("QUIT")) {
            System.out.println("BOB: What do you want..");
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure?");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        }
    }
}

//davids bob

//public class Bob {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hey, my name's Bob... My mom said you wanted to talk to me, or something... Whatever...");
//        String response = "";
//        while(!response.equalsIgnoreCase("QUIT")) {
//            System.out.println("What do you want?");
//            response = sc.nextLine();
//            if (response.isEmpty()) {
//                System.out.println("Fine. Be that way!");
//            } else if (response.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (response.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if (response.equalsIgnoreCase("quit")){
//                System.out.println("Finally...");
//            } else {
//                System.out.println("Whatever.");
//            }
//        }
//        System.out.println("I'm out of here...");
//    }
//}
