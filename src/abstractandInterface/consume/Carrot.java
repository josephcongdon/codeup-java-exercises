package abstractandInterface.consume;

public class Carrot implements Consumable {
    protected String name;

    public Carrot(String name){
        this.name = name;
    }

    @Override
    public void consume() {
        System.out.println(name + " was chewed");
    }
}
