import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       String listenBob = "";
        System.out.println("Time to talk to Bob....");
       do{
            listenBob = scanner.next();
            if(listenBob.contains("."))
                System.out.println("* grunting noise*");
            if(listenBob.contains("!"))
                System.out.println("Whoa chill out bro! You're not my real father!");
            if(listenBob.contains("?"))
                System.out.println("sure");
       }while(listenBob.length() > 1);
        System.out.println("fine be a jerk");

    }
}
