package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle(3,9);
        Measurable square = new Square(6);
//        System.out.println(myShape.getLength());
//        System.out.println(myShape.getWidth());

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(square.getArea());

//        System.out.printf("the area and the perimeter are %.2d%s%s", myShape.getArea(), myShape.getPerimeter());

//        Rectangle box1 = new Rectangle(4,5);
//        Rectangle box2 = new Square(5);
//        System.out.println(box1.getArea() + " is the area");
//        System.out.println(box1.getPerimeter() + " is the perimeter");
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
