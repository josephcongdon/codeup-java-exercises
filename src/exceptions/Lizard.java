package exceptions;

import java.util.Scanner;

public class Lizard {
    protected String name;
    public Lizard(String name) throws IllegalArgumentException{
        if(name == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void subListMaker (String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println();

    }
}
