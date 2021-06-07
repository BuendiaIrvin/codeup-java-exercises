package shapes;

public class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;


    public void lengthWidth(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
