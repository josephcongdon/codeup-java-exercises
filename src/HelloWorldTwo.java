import java.io.PrintStream;
import java.util.Scanner;

public class HelloWorldTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = null;
        do {
            System.out.println("Welcome back to draco. Are you ready to study?");
            input = sc.nextLine();
            if (input.equals("yes") || input.equals("y")) {
                System.out.println("Very good.");
            } else if (input.equals("no") || input.equals("n")) {
                System.out.println("Come back later then.");
            }
        } while (false);
    }

}
