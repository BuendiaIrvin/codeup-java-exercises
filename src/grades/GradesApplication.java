package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends Student {


    public GradesApplication(String name) {
        super(name);
    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap();

        Student student1 = new Student("Greg");
        Student student2 = new Student("Phil");
        Student student3 = new Student("Jim");

        student1.addGrade(85);
        student1.addGrade(70);
        student1.addGrade(91);

        student2.addGrade(91);
        student2.addGrade(99);
        student2.addGrade(89);

        student3.addGrade(70);
        student3.addGrade(81);
        student3.addGrade(65);

        students.put("GregoryG", student1);
        students.put("PhilP", student2);
        students.put("JimJ", student3);

        System.out.println(student1.getGradeAverage());
        System.out.println(student2.getGradeAverage());
        System.out.println(student3.getGradeAverage());


        //    public void getInfo(ArrayList<String> list HashMap <String, Student> students){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("would you like to put something in the fridge (Y/N)");
//        String userChoice = sc.nextLine();
//        while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
//            System.out.println("What would you like to put in the fridge?");
//            String item = sc.nextLine();
//            System.out.printf("sounds good! Ill keep your %s cold for you\n", item);
//            System.out.println("would you like to put anything else in the firdge? (Y/N)");
//            userChoice = sc.nextLine();
//
//        }
//        System.out.println("okay stay cool!");
//    }

    }
}
