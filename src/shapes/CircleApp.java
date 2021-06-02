package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of circle?");
        Input test = new Input();

        Circle c = new Circle(test.getDouble());

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }

}
