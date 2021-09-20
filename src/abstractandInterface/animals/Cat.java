package abstractandInterface.animals;


public class Cat extends Pets implements Feedable{

    public String name;

    public Cat(String name){
        this.name = name;
    }


    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }

    public void feed(){
        System.out.println("The cat " + name +  " can be fed");
    }

    public void responseToCommand(String command) {
        System.out.println("Meow... coughs up hairball...");
    }

}
