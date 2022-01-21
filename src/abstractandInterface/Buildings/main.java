package abstractandInterface.Buildings;

public class main {

    public static void main(String[] args) {
        Business myBusiness = new Business("Gennaros", 6, "restaurant");

        System.out.println(myBusiness.name + " is "+ myBusiness.age + " years old.");
        myBusiness.hours(12);
        myBusiness.responseToComplaint("uncooked food");
        myBusiness.work();
    }
}
