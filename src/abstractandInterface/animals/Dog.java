package abstractandInterface.animals;

public class Dog extends Pets implements Feedable{
    public String name;

    public Dog(String name){
        this.name = name;
    }


    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }
    public void feed(){
        System.out.println("The " + name + " can be fed");
    }

    public void responseToCommand(String command) {
        System.out.println("Obeys " + command + " dutifully...");
    }

}
