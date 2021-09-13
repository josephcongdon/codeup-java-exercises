package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        String prompt = "enter the radius of a circle: ";
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference  = circle.getCircumference();
        System.out.printf("The area %.2f circumference is %.2f%n", area, circumference);
    }
}
