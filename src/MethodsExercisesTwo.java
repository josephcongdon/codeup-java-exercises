import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercisesTwo {




    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your first number: ");
    int a = scanner.nextInt();
    int b = (int) (Math.random() * 101);


    System.out.println("Your numbers are " + a + " and " + b);
    System.out.println(a + " plus " + b + " equals " + (a+b));
    System.out.println(a + " minus " + b + " equals " + (a-b));
    System.out.println(a + " times " + b + " equals " + (a*b));
    System.out.println(a + " divided " + b + " equals " + (double) a/b);


    }
}
