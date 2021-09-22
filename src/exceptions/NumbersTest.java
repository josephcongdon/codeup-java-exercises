package exceptions;

import java.util.Scanner;

public class NumbersTest {

    public static void main(String[] args) {
        NumbersTest.processNumber();

    }
    private static void processNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("insert a number:  ");
        try{
            NumbersTest.validateNumber(sc.nextInt());
        } catch(IndexOutOfBoundsException e){
            System.out.println("Throw the index out of bounds error " + sc.nextLine());
            NumbersTest.processNumber();
            throw new IndexOutOfBoundsException();
        }
        System.out.println("Thank you it worked");

//        finally {
//            System.out.println("Thank you it worked ...  for once.");
//        }

    }

    private static void validateNumber(int num){
        if(num > 10 || num < 1){
            throw new IndexOutOfBoundsException();
        }
    }

}
