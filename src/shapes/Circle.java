package shapes;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = (int) radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference(){
        return Math.PI * radius;
    }

    public static void main(String[] args) {

    }
}
