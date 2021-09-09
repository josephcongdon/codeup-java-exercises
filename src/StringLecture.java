import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = sc.next();
        if (userInput.equals("Justin")) {
            System.out.println("The user entered the string 'Justin'");
        } else {
            System.out.println("The user did not enter the string 'Justin'");
        }


    }
}
