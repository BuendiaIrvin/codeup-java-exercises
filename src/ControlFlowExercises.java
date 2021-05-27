import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//         1.a while
// to get a horizontal answer you di print not println
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        2.a do while

//        int i = 0;
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
//        } while (i < 1000000);


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

//        {
//            final String PASSWORD = "Test";
//            Scanner sc = new Scanner(System.in);
//            int attempts = 3;
//            String password = "";
//            while (attempts-- > 0 && !PASSWORD.equals(password)) //compares and then decrements
//            {
//                System.out.print("Enter your password: ");
//                password = sc.nextLine();
//                if (password.equals(PASSWORD))
//                    System.out.println("Welcome");
//                else
//                    System.out.println("Incorrect. Number of attempts remaining: " + attempts);
//            }
//
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to?");
//        int userInput = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Here is you table!");
//
//
//        for (long i = 1; i <= userInput; i += 1) {
//            long number = i;
//            long squared = i *= i;
//            long cubed = Math.pow(i , 3);
//                    System.out.println();
//
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What was your numerical Grade?");
//        int userInput = Integer.parseInt(scanner.nextLine());
//
//
//        int y = userInput;
//        if (y > 0 && y < 59){
//            System.out.println("F");
//        } else if (y >=60 && y < 62){
//            System.out.println("D-");
//        } else if (y >=63 && y < 66){
//            System.out.println("D");
//        } else if (y >=67 && y < 69){
//            System.out.println("D+");
//        } else if (y >=70 && y < 72){
//            System.out.println("C-");
//        } else if (y >=73 && y < 76){
//            System.out.println("C");
//        } else if (y >=77 && y < 79){
//            System.out.println("C+");
//        } else if (y >=80 && y < 82){
//            System.out.println("B-");
//        } else if (y >=83 && y < 86){
//            System.out.println("B");
//        } else if (y >=87 && y < 89){
//            System.out.println("B+");
//        } else if (y >=90 && y < 92){
//            System.out.println("A-");
//        } else if (y >=93 && y < 96){
//            System.out.println("A");
//        } else if (y >=97 && y < 100){
//            System.out.println("A+");
//        } else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }
//
//    }
//    }

//                 1. Loop Basics a. While
//        int i = 5;
//        while (i <= 15){
//            if (i < 15) {
//                System.out.print(i + " ");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }
//
////                 b. Do While
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
//
////                 c. For
//
//        for (int i = 100; i >= -10; i -=5 ){
//            System.out.println(i);
//        }
//
//        for (long i = 2L; i < 1000000; i *= i){
//            System.out.println(i);
//        }
//
////                 2. The PIN Problem
//
//        Scanner scanner1 = new Scanner(System.in);
//        final int PIN = 12345;
//        int userInput = 0;
//        int attempts = 1;
//        while (attempts <=3){
//            System.out.println("Please enter pin: ");
//            userInput = scanner1.nextInt();
//            if (userInput != PIN){
//                if (attempts < 3){
//                    System.out.println("Incorrect, try again");
//                } else {
//                    System.out.println("Sorry but you have been locked out.");
//                }
//            } else {
//                System.out.println("Correct, welcome back");
//                break;
//            }
//            attempts++;
//        }
//
////                 3. Display a table of powers
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        boolean userWantsToContinue = false;
//        do {
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
//            }
//            System.out.println("Enter another number? y/n");
//            String userAnswer = scanner.next();
//            if (userAnswer.equals("y")){
//                userWantsToContinue = true;
//            } else {
//                break;
//            }
//        } while (userWantsToContinue);
//
//
////                 4. Convert given number grades into letter grades
//
//                Scanner scanner1 = new Scanner(System.in);
//                String userChoice = "y";
//                while (!userChoice.equals("n")) {
//                    System.out.println("Enter the student's numerical grade: ");
//                    byte grade = scanner1.nextByte();
//                    char letterGrade;
//                    if (grade > 0 && grade <= 59) {
//                        letterGrade = 'F';
//                    } else if (grade > 59 && grade <= 66) {
//                        letterGrade = 'D';
//                    } else if (grade > 66 && grade <= 79) {
//                        letterGrade = 'C';
//                    } else if (grade > 79 && grade <= 87) {
//                        letterGrade = 'B';
//                    } else {
//                        letterGrade = 'A';
//                    }
//                    System.out.println("The letter grade is: " + letterGrade);
//                    System.out.println("Would you like to enter another grade?(y/n)");
//                    userChoice = scanner1.next();
//                }

            }
        }



