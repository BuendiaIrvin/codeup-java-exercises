package shapes;

public class Circle {
    private int radius;
    public double pi = 3.14;


    public Circle(double radius) {};

    public void setRadius() {
        this.radius = radius;
}

    public double getArea() {
        return (pi * radius * radius);
    }
}
