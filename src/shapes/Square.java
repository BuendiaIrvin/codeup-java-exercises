package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

//    public void lengthWidth(double measurement) {
//        this.length = measurement;
//        this.width = measurement;
//    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}
