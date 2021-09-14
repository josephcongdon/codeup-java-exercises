import java.util.Arrays;


public class ArraysExercises {


//TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
//            Find the sum of all five double values using an enhanced for loop.


public static Person[] addPerson(Person[] person, Person newPerson){
    Person[] person2 = Arrays.copyOf( person, person.length+1);
    person2[person2.length -1] = newPerson;
    return person2;
}



    public static void main(String[] args) {
        Person jeff = new Person("Jeff");
        Person[] person = {
                new Person("John"),
                new Person("Joe"),
                new Person("Greg")
            };
//        for(Person p : person){
//            System.out.println(p.getName());
//        }
        addPerson(person, jeff );
        for(Person p : addPerson(person, jeff )){
            System.out.println(p.getName());
        }


//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//        int[] Person = new int[3];
//
//        double sum = 0;
//        double[] numbers = new double[5];
//        for(double number : numbers){
//            sum += number;
//            System.out.println(sum);
//        }

    }


}
