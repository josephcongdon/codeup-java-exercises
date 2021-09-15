package shapes;

public class Square extends Rectangle{

    protected Double side;

//    public Square(double length, double width) {
//        super(length, width);
//    }

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    public double getArea() {
        return Math.pow(side , 2);
    }

}
