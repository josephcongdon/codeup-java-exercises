import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Time to talk to Bob....");
       String listenBob = scanner.next();
       do{
            if(listenBob.contains("!"))
                System.out.println("Whoa chill out bro! You're not my real father!");
            if(listenBob.contains("?"))
                System.out.println("sure");
       }while(listenBob.endsWith("?") || listenBob.endsWith(".") || listenBob.endsWith("!"));


    }
}
