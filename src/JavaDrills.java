import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class JavaDrills {
    // work in progress
//    public static String flipOuterCase(String word){
//        for(int i = 0; i <= word.length(); i++){
//            String firstLetter = String.valueOf(word.charAt(0));
//            String lastLetter = String.valueOf(word.charAt(word.length()-1));
//
//            if()
//        }
//    }

//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.

//    returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2


    public static double returnTotalDifference(int[] arr1, int[] arr2){
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        return sum1 - sum2;
    }

    public static void main(String[] args) {
        System.out.println( returnTotalDifference(new int []{1,2,3,4}, new int []{5,6,7,8}));
    }

}
