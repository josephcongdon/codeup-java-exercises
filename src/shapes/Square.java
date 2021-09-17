package shapes;

public class Square extends Quadrilateral implements Measurable{

    public Square(int side){
        super(side , side);
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public double getArea() {
        return Math.pow(length , 2);
    }

    @Override
    void setWidth(double width) {

    }

    @Override
    void setLength(double length) {

    }


//    protected Double side;
//
////    public Square(double length, double width) {
////        super(length, width);
////    }
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("perimeter: ");
//        return 4 * side;
//    }
//    public double getArea() {
//        System.out.println("area: ");
//        return Math.pow(side , 2);
//    }

}
