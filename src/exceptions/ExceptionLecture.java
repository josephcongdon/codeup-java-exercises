package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionLecture {

    public String couldBeAnInteger = "42";
    public String certainlyNotAnInteger = "No integer at all here";




//    public void askForInteger() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an int: ");
//        String usrInput = sc.nextLine();
//        try{
//            int userInputInteger = Integer.parseInt(usrInput);
//            System.out.println("The integer in your string is " + userInputInteger);
//        } catch(NumberFormatException nfx) {
//            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
//        }finally {
//            System.out.println("Thank you for using this.");
//        }
//    }


    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray){
            wordArrayList.add(word);
        }
        List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
        String newSentence = String.join(" ", shorterList);
        System.out.println(newSentence);
    }


}
