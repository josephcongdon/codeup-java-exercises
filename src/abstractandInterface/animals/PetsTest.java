package abstractandInterface.animals;

public class PetsTest{
    public static void main(String[] args) {
        Pets dog = new Dog("Sparky");
        Pets cat = new Cat("Sprinkles");
        dog.eat();
        cat.eat();

    }

}
