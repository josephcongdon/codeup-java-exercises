package abstractandInterface.Buildings;

import java.util.ArrayList;

public class Business extends Buldings implements Workable{

    public Business(String name, int age, String type) {
        super(name, age, type);
    }


    public void hours(int noOfHours) {
        System.out.println("we are open for " + noOfHours + " hours a day.");
    }

    public void responseToComplaint(String response) {
        System.out.println("I will look into your " + response + " immediately.");
    }


    public void work() {
        System.out.println("This is a place of business");
    }

    Business mcdonalds = new Business("mcdonalds",3,"restaurant");

    Business walmart = new Business("walmart", 15, "retail");

}
