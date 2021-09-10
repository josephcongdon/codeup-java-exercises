public class Person {
private String name;


    public String getName(){
        return name = "Penny";
//TODO: return the person's name
    }

    public void setName(String name){

//TODO: change the name property to the passed value
    }
    public void sayHello(){
        System.out.println("Hello there I am " + name + "! nice to meet you.");
//TODO: print a message to the console using the person's name
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.getName();

    }
}
