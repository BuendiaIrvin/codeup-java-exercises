import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void diceRoll() {
        Random r = new Random();
        int result = r.nextInt(100);
        System.out.println(result);
//        System.out.println("Pick a number between 1 and 100");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();

        int x = 0;
        while (x != result) {
            System.out.println("Pick a number between 1 and 100");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            if (x > result) {
                System.out.println("LOWER");
            } else if (x < result) {
                System.out.println("HIGHER");
            }
        }System.out.println("GOOD GUESS");
    }



    public static void main(String[] args) {
        diceRoll();

    }
}
