package movies;

public class MoviesApplication {
        public static void main(String[] args) {
            Movie movie = new Movie("Dirty Work", "Bob Saget");
            System.out.println(movie.audienceReaction());
        }



//        public  String userInput(){
//        Scanner scanner =  new Scanner(System.in);
//            System.out.println("What is your favorite movie?");
//            String movieName = scanner.nextLine();
//            return movieName;
//        }


}
