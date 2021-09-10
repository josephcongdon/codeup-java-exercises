public class Trex {
    public String name;
    public String sound;
    private String type;
    public void makeNoise(){
        System.out.println(name + " the " + type + " usually made a " + sound);
    }

    public Trex(){}

    public Trex(String name, String sound, String type){
        System.out.println("A new dinosaur was discovered!");
        this.name = name;
        this.type = type;
        this.sound = sound;

    }
}
