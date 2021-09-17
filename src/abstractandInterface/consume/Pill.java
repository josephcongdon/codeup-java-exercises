package abstractandInterface.consume;

public class Pill implements Consumable{
    protected String name;

    public Pill(String name){
        this.name = name;
    }

    @Override
    public void consume() {
        System.out.println( name + " was swallowed");
    }
}
