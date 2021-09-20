package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
      this.name = name;
      this.grades = new ArrayList<Integer>();
    }



    public String getName() {
        return name;
    }
// returns the student's name
//    public String getName();
    // adds the given grade to the grades property

    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades

    public double getGradeAverage(){
        int count = 0;
        double totalGrade = 0;
        for(int grade : grades){
            count++;
            totalGrade += grade;
        }
        return totalGrade/count;
    }



}
