package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
//    private ArrayList<String> attendance;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }



    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
    int gradeCounter = 0;
    for(int x = 0; x < grades.size(); x++){
        int grade = grades.get(x);
        gradeCounter += grade;
    }
    return (gradeCounter / grades.size());
    }

//    public void addAttendance(String att){
//        attendance.add(att);
//    }



    public  void setName(String name){
        this.name = name;
        ArrayList<Integer> grades = new ArrayList<>();
//        ArrayList<String> attendance = new ArrayList<>();
    }


    public static void main(String[] args) {
        Student Irvin = new Student("Irvin");
        Irvin.setName("Irvin");
        System.out.println(Irvin.getName());
        Irvin.addGrade(100);
        Irvin.addGrade(50);
        Irvin.addGrade(100);
        Irvin.addGrade(50);

        System.out.println(Irvin.grades);
        System.out.println(Irvin.getGradeAverage());
    }
//    public void Command(){
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
