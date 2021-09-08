import java.util.Scanner;


public class Therapist {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        String userReply = "";

        System.out.println("How are you feeling today? ");
        userReply = scanner.nextLine();
        System.out.println(userReply);
        if(userReply == "no")
        System.out.println("Oh really? Did you have the nightmare about the margarine again? Maybe you should stop sleeping.");
        else if(userReply == "good")
            System.out.println("I am so glad to hear that! It means you are ready for shock therapy!");
        else if (userReply == "ok")
            System.out.println("Only Ok? Probably need more pills. I took some this morning.... I feel .... so good....");
            else
            System.out.println("Oh dear you are going delirious! Let's get you a lobotomy");
        }
    }
}
