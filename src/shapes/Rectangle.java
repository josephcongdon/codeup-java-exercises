package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width){
        super(length ,width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setWidth(double width) {

    }

    @Override
    void setLength(double length) {

    }


    //    protected double length;
//    protected double width;
//
//    public Rectangle(double length , double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//    return length * width;
//    }
//
//    public double getPerimeter(){
//    return 2 * length + 2* width;
//    }



}
