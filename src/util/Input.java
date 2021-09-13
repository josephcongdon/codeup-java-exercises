package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public String getString(){
        System.out.println("Please enter a string: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(String input){
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public boolean yesNo(){
        System.out.println("Do you agree?");
        String answer = scanner.next();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        return userInput;
    }

        public int getInt(int min, int max){
            System.out.println("enter a number between " + min + " and " + max);
            int userInput = scanner.nextInt();
            if (userInput < min && userInput > max){
                System.out.println("enter a number between " + min + " and " + max);
                getInt(min, max);
            }
            return userInput;
        }
        public double getDouble(){
        System.out.println("Enter a number: ");
        double userInput = scanner.nextDouble();
        return userInput;
        }


    public Input(){
        scanner = new Scanner(System.in);

    }


}
