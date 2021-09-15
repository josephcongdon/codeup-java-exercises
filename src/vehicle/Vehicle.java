package vehicle;

public class Vehicle {
    protected String name;

    public Vehicle() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("vroom vroom");
    }

    public void makeAlarm(){
        System.out.println("whooo beep! whooo beep!");
    }

    public Vehicle(String name){
        this.name = name;
    }

}


