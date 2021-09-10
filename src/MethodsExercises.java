import java.util.Scanner;



public class MethodsExercises {

    public static double Addition(int x, int y) {
        return x + y;
    }

    public static double Subtraction(int x, int y) {
        if(y > x) return y - x;
        return x - y;
    }

    public static double Multiplication(int x, int y) {
        return x * y;
    }

    public static double Division(int x, int y) {
        if(y > x) return y / x;
        return x / y;
    }

    public static double Modulus(int x , int y){
        if(y > x) return y % x;
        return x % y;
    }


    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();
        if (userNumber <= max && userNumber >= min){
            System.out.println(userNumber + " is in between those numbers.");
        } else{
            System.out.println("The number " + userNumber + " is not in between the given numbers... try again!");
          return getInteger(min, max);
        }
        return userNumber;
    }


//    public static long factor(long num) {
//        if(num <= 1) return 1;
//        System.out.println(num - 1);
//        return factor(num - 1) * num;
//     }


    public static int randomDie(){
        int num = (int) (Math.random() * 6) + 1;
        return num;
    }

    public static void diceScore(){
        int dice1 = randomDie();
        System.out.println("your first roll was a " + dice1);
        int dice2 = randomDie();
        System.out.println("your second roll was a " + dice2);
        System.out.println("The total of your two dice rolls was a " + (dice1 + dice2));
    }

    public static String userChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you want to roll the die [Y / N]");
        String answer = scanner.nextLine();
//        if(!answer.equals("y") && (!answer.equals("n")))
//            System.out.println("Sorry I did not get that...");
//                userChoice();
        if(answer.equals("n")) {
            System.out.println("Ok come back later...");
                userChoice();
        }else{
            System.out.println("Ok lets get started.");
            diceScore();
        }
        return answer;
    }


    public static void main(String[] args) {
//        System.out.println(Addition(5, 7));
//        System.out.println(Subtraction(6, 8));
//        System.out.println(Multiplication(7, 9));
//        System.out.println(Division(5, 10));
//        System.out.println(Modulus(50, 5));
//          int userInput = getInteger(1, 10);
//        System.out.println(factor(userInput));
//        System.out.println("Congrats! " + userInput + " broke the cycle.");
        userChoice();
    }
}


