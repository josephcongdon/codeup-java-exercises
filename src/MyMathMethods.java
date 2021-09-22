import java.util.ArrayList;
import java.util.Arrays;

public class MyMathMethods {

    public static double multiply(double x, double y){
        return x * y;
    }

    public static double quotient(double x, double y){
        if(x < y){
            return y/x;
        }else{
            return x/y;
        }
    }

    public static int arraySum(int[] number){
        return Arrays.stream(number).sum();
    }
}
