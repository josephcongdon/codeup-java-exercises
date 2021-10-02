package review;

public class Person {
//    public static int factorial(int n){
//        int fact =1;
//        for (int i =2; i <= n; i++){
//            System.out.println(i);
//            fact = fact * i;
//        }
//        System.out.println("______");
//        return fact;
//    }

//    public static double quotient(double divisor, double dividend){
//        return divisor/dividend;
//    }

    public static int minMaxSum(int [] arr){
        int max = 0;
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return  max + min;
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(quotient(16,5));



        System.out.println(minMaxSum(new int[]{1, 3, 5, 10}));

    }

}
