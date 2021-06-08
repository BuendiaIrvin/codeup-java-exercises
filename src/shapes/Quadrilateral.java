package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double side, double side1) {
        super();
    }


    public void lengthWidth(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
