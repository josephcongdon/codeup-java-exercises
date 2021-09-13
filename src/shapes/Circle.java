package shapes;

public class Circle {
private int radius;
    public Circle(double radius){
        this.radius = (int) radius;
    }
    public double getArea(){
        return Math.PI * radius;
    }
    public double getCircumference(){
        return (radius * 2) * Math.PI;
    }

    public static void main(String[] args) {

    }
}
