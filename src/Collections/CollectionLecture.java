package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionLecture {


    public static void main(String[] args) {


//        ArrayList<Integer> numbers = new ArrayList<>();
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.remove(1);
//
//        System.out.println(numbers);


//
//        List<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
//        for (String name : names){
//            System.out.println(name.toUpperCase());
//        }
//        System.out.println(names.get(1));
        List<String> keys = new ArrayList<>(Arrays.asList(
                "One",
                "Two",
                "Three",
                "Four"
        ));

        List<String> values = new ArrayList<>(Arrays.asList(
                "Alpha",
                "Beta",
                "Citra",
                "Dominae"
        ));


        HashMap<List<String>, List<String>> createMap = new HashMap<>();
        for(int i = 0; i< createMap.size(); i++)
        createMap.put(keys, values);
        System.out.println();

//        HashMap<String, String> usernames = new HashMap<>();
//        usernames.put("Zach", "mondego");
//        System.out.println(usernames.get("mondego"));
//        System.out.println(usernames);



    }

}
