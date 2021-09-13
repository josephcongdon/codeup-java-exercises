package shapes;
import java.util.Scanner;
public class CircleApp {

    public static int getRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of a circle: ");
        int userRadius = sc.nextInt();
        return userRadius;
    }

}
