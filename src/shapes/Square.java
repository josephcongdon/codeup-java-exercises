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
        System.out.println("perimeter: ");
        return 4 * side;
    }
    public double getArea() {
        System.out.println("area: ");
        return Math.pow(side , 2);
    }

}
