import java.util.Scanner;

public class MethodsExercisesTwo {

    double Addition(int a, int b){
        return a + b;
    }

    double Subtraction(int a, int b){
        return a - b;
    }

    double Multiply(int a, int b){
        return a * b;
    }

    double divide(int a, int b){
        if (b > a) return b / a;
        return a / b;
    }

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

    }
}
