import java.util.Scanner;

public class MethodsExercisesTwo {




    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = 0;
    int b = 0;

    double addition(a, b){
        return a + b;
    }

    double subtraction(a, b){
        return a - b;
    }

    double multiply(a, b){
        return a * b;
    }

    double divide(a, b){
        if (b > a) return b / a;
        return a / b;
    }

    int sumTotal = addition() + subtraction() + multiply() + divide();

    }
}
