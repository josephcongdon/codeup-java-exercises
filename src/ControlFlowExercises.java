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

        Scanner scanner = new Scanner(System.in);

        System.out.println("choose a number to go to: ");
        int promptNumber = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i <= promptNumber; i++) {
            int squared = ((int) Math.pow(i, 2));
            int cubed = ((int) Math.pow(i, 3));
            System.out.println(i);
            System.out.println(squared);
            System.out.println(cubed);
        }
      }
    }


