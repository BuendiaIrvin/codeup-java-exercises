package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int l, int w) {
        this.length = l;
        this.width = w;

    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }

}
