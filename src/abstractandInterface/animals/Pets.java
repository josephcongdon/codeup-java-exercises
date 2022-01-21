package abstractandInterface.animals;

abstract class Pets {

    public int age;
    public int weight;
    public String species;
    public String name;


    public abstract void rest(int noOfHours);

    public abstract void responseToCommand(String command);

    public void eat(){
        System.out.println("munch");
    };
}
