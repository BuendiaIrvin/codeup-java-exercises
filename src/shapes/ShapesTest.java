package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle cardinal = new Rectangle(5,10);
        System.out.println(cardinal.getArea());
        System.out.println(cardinal.getPerimeter());
        Square finch = new Square(5);
        System.out.println(finch.getArea());
        System.out.println(finch.getPerimeter());
    }
}