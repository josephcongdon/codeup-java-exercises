import java.util.Scanner;

public class MovieTest {

    public static void main(String[] args) {
        Movie movie = new Movie("Dirty Work", "Bob Saget");
        Movie movie2 = new Movie(null,null);
    }




        public  String userInput(){
        Scanner scanner =  new Scanner(System.in);
            System.out.println("What is your favorite movie?");
            String movieName = scanner.nextLine();
            return movieName;
        }
}
