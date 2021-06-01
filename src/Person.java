
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }
}