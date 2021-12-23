import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercisesTwo {

    public static void main(String[] args) {
        overOneThousand();
    }


    public static void overOneThousand(){

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your first number: ");
    int a = scanner.nextInt();
    int b = (int) (Math.random() * 101);

    int addition = a + b;
    int subtraction = a - b;
    int multiply = a * b;
    double divide = ((double) a/b);

    double sumTotal = addition + subtraction + multiply + divide;

    System.out.println("Your numbers are " + a + " and " + b);
    System.out.println(a + " plus " + b + " equals " + addition);
    System.out.println(a + " minus " + b + " equals " + subtraction);
    System.out.println(a + " times " + b + " equals " + multiply);
    System.out.println(a + " divided " + b + " equals " + divide);
    System.out.println("the sum total of the previous numbers is " + sumTotal);
        if (sumTotal < 1000){
            System.out.println(sumTotal + " is less that 1000. Let's try again");
            overOneThousand();
            } else{
                System.out.println("Congrats " + sumTotal + " is over 1000");
            }
        }

}
