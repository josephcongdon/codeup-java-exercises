import java.util.Scanner;

public class MethodsMiniExercises {

    // TODO: break the following code apart into a few methods

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        String stringInput = sc.nextLine();
        return stringInput;
    }

    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int intInput = sc.nextInt(); // assume the user will enter a valid integer
        return intInput;
    }

    public static void matchInput() {
        String stringInput = getInput();
        int intInput = getInteger();
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }


    public static void main(String[] args) {;
            getInput();
            getInteger();
            matchInput();
        }

}
