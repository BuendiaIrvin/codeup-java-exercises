import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//         1.a while

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        2.a do while

//        int i = 2;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);


//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);


//        1.c for


//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }


//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }


//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

        {
            final String PASSWORD = "Test";
            Scanner sc = new Scanner(System.in);
            int attempts = 3;
            String password = "";
            while (attempts-- > 0 && !PASSWORD.equals(password)) //compares and then decrements
            {
                System.out.print("Enter your password: ");
                password = sc.nextLine();
                if (password.equals(PASSWORD))
                    System.out.println("Welcome");
                else
                    System.out.println("Incorrect. Number of attempts remaining: " + attempts);
            }

        }
    }
}
