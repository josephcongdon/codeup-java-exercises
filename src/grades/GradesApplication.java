package grades;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {

    public static void getStudentInfo(HashMap students){

        Scanner sc = new Scanner(System.in);
        boolean confirmation;

        do {
            System.out.println("What student would you like info on: ");
            String userInput = sc.nextLine().trim().toLowerCase();

            if (students.containsKey(userInput)) {
                Student chosen = (Student) students.get(userInput);
                System.out.println("Name: " + chosen.getName() + " user_name: " + userInput + " Current Average: " + chosen.getGradeAverage());
            }else{
                System.out.println("no student by that username...");
            }
            System.out.println("would you like to see another Student? ");
            String userBoolean = sc.nextLine();
            confirmation = userBoolean.equalsIgnoreCase("y")|| userBoolean.equalsIgnoreCase("yes");
        }while(confirmation);
        System.out.println("Goodbye! Come back soon.");
    }



    public static void main(String[] args) {

        Student student = new Student("Amanda");
        student.addGrade(99);
        student.addGrade(75);
        student.addGrade(100);

        Student student1 = new Student("Fred");
        student1.addGrade(55);
        student1.addGrade(44);
        student1.addGrade(100);

        Student student2 = new Student("Daffknee");
        student2.addGrade(99);
        student2.addGrade(100);
        student2.addGrade(100);

        Student student3 = new Student("Brian");
        student3.addGrade(75);
        student3.addGrade(75);
        student3.addGrade(75);


        HashMap<String, Student> students = new HashMap<>();
        students.put("amandapanda", student);
        students.put("fredmercury", student1);
        students.put("betterthanthou", student2);
        students.put("bigchungusbrian", student3);
        System.out.println();

        for (String key : students.keySet()) {
            System.out.print(" |" + key + "| ");
        }


//        System.out.printf("The Student %s has a grade average of %.2f ", student.getName(), student.getGradeAverage());
//        System.out.println();
//        System.out.printf("The Student %s has a grade average of %.2f ", student1.getName(), student1.getGradeAverage());
//        System.out.println();
//        System.out.printf("The Student %s has a grade average of %.2f ", student2.getName(), student2.getGradeAverage());
//        System.out.println();
//        System.out.printf("The Student %s has a grade average of %.2f ", student3.getName(), student3.getGradeAverage());


        getStudentInfo(students);
    }

}
