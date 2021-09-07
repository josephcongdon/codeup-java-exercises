import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while( i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }


//        int i = 0;
//
//        do{
//            System.out.println(i);
//            i++;
//        }while(i <= 100);

//        int i = 100;
//
//        do{
//            System.out.println(i);
//            i = i-5;
//        }while(i >= -10);


//        int i = 2;
//
//        do{
//            System.out.println();
//            i=i*i;
//        }while(i < 1000000);


//        for(int i = 100; i >= -10; i=i-5){
//            System.out.println(i);
//        }

//        for (int i = 2; i < 1000000; i = (int) Math.pow(i, 2)){
//            System.out.println(i);
//        }


//        for(int i = 1; i<= 100; i++){
//            if (((i % 5) == 0) && ((i % 3) == 0))
//            System.out.println("fizzbuzz");
//            else if((i % 5)==0)
//                System.out.println("buzz");
//            else if ((i % 3) == 0)
//                System.out.println("fizz");
//            else
//                System.out.println(i);
//
//            }
        String promptUser = "";
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("choose a number to go to: ");
            int promptNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("here is your table");
            System.out.printf("number ");
            System.out.printf("squared ");
            System.out.printf("cubed ");
            for (int i = 1; i <= promptNumber; i++) {
                int squared = ((int) Math.pow(i, 2));
                int cubed = ((int) Math.pow(i, 3));
                System.out.println(" ");
                System.out.printf(" " + i);
                System.out.printf(" ");
                System.out.printf(" " + squared);
                System.out.printf(" ");
                System.out.printf(" " + cubed);
            }
            System.out.println("");
            System.out.printf(" do you wish to continue? ");
            promptUser = scanner.nextLine();
        } while(promptUser.equals("no"));





//        int c = 0, d = 100, e = 50;
//        if( c == 0 && e++ < 100 )
//        {
//            d = 150;
//        }
//        System.out.println("e = " + e );

        // write a Java program that asks the user for their age and then tells them if they are a teenager or not.
        // bonus: if not, tell them whether they are younger or older than a teenager.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" How old are you: ");
//        int userAge = Integer.parseInt(scanner.nextLine());
//        if (userAge > 19)
//            System.out.println("at " + userAge + " you are older than a teenager. You are an adult.");
//        else if (userAge < 13)
//            System.out.println("at " + userAge + " you are younger than a teenager.");
//        else
//            System.out.println("at " + userAge + " you are a teenager!");

//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);




      }
    }


