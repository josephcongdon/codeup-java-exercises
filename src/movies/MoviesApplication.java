package movies;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoviesApplication {
        public static void showMenu(){
                System.out.println(
                 "        0. Exit.\n" +
                 "        1. View all movies.\n" +
                 "        2. view movies in the animated category.\n" +
                 "        3. view movies in the drama category.\n" +
                 "        4. view movies in the horror category.\n" +
                 "        5. view movies in the scifi category.\n" +
                 "        Enter an option (0, 1, 2, 3, 4 or 5):" );
        }


        private static List<Movie> showList(List<Movie> movieList) throws IOException {
                MoviesArray.findAll();
                for(Movie m: movieList){
                        System.out.printf("%5s | %-10s \n", m.getName(), m.getCategory());
                }
                return movieList;
        }

        private static List<Movie> showAnimatedList(List<Movie> movieList) throws IOException{
                List<Movie> movieAnimeList = new ArrayList<>();
                MoviesArray.findAll();
                for(Movie m: movieList){
                        if(m.getCategory().equals("animated")){
                         System.out.printf("%5s \n", m.getName());
                        }
                }
                return  movieList;
        }

        private static List<Movie> showDramaList(List<Movie> movieList) throws IOException{
                List<Movie> movieDramaList = new ArrayList<>();
                MoviesArray.findAll();
                for(Movie m: movieList){
                        if(m.getCategory().equals("drama")){
                                System.out.printf("%5s \n", m.getName());
                        }
                }
                return  movieList;
        }

        private static List<Movie> showHorrorList(List<Movie> movieList) throws IOException{
                List<Movie> movieHorrorList = new ArrayList<>();
                MoviesArray.findAll();
                for(Movie m: movieList){
                        if(m.getCategory().equals("horror")){
                                System.out.printf("%5s \n", m.getName());
                        }
                }
                return  movieList;
        }


        private static List<Movie> showScifiList(List<Movie> movieList) throws IOException{
                List<Movie> movieScifiList = new ArrayList<>();
                MoviesArray.findAll();
                for(Movie m: movieList){
                        if(m.getCategory().equals("scifi")){
                                System.out.printf("%5s \n", m.getName());
                        }
                }
                return  movieList;
        }

        public static void main(String[] args) throws IOException {



        List<Movie> movieList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String userInput;

        do{
        showMenu();
        userInput = sc.nextLine();

        switch(userInput){
                case "0":
                        System.out.println("Thanks for viewing the MovieList");
                        return;

                case "1":
                        showList(Arrays.asList(MoviesArray.findAll()));
                        break;
                case "2":
                        showAnimatedList(Arrays.asList(MoviesArray.findAll()));
                        break;
                case "3":
                        showDramaList(Arrays.asList(MoviesArray.findAll()));
                        break;
                case "4":
                        showHorrorList(Arrays.asList(MoviesArray.findAll()));
                        break;
                case "5":
                        showScifiList(Arrays.asList(MoviesArray.findAll()));
                        break;

                default:
                System.out.println("Wrong input. Please try again: ");

        }

     }while(!userInput.equalsIgnoreCase("1"));

  }


}
