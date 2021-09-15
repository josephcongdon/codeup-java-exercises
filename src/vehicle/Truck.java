package vehicle;

public class Truck extends Vehicle{



    public Truck (){
        super("Truck");
    }

    public Truck (String name){
        super(name);
        System.out.println("a new Truck is in the garage");
    }

    public void setName(String truckName){
        super.name = truckName;
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println("rumble rumble");
    }

}
