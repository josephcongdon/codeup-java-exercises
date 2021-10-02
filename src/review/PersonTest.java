package review;

import java.util.Arrays;
import java.util.HashMap;

public class PersonTest {

    public static void main(String[] args) {


//            int i = 0;
//            do{
//                i++;
//                System.out.println(i);
//            } while(i < 10);

            String[] strs = new String[4];
        strs[0] = "one";
        strs[1] = "two";
        strs[2] = "three";
        strs[3] = "four";

        System.out.println(Arrays.toString(strs));

        // List vs. HashMaps

        //list of elements vs. key-value pairs

        String ssn1 = "123456789";
        String ssn2 = "987654321";
        String ssn3 = "908070605";

        HashMap<String, Person> people = new HashMap<>();

        people.put(ssn1, new Person());
        people.put(ssn2, new Person());
        people.put(ssn3, new Person());

        System.out.println(people);

        System.out.println(people.get(ssn1));


    //Polymorphism: overriding / overloading





    }
}
