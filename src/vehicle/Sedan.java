package vehicle;

public final class Sedan extends  Vehicle{
    protected String car;

    public Sedan(){

    }
    public Sedan(String car){
        this.car = car;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(this.name + " goes ");
        System.out.println("ZOOM ZOOM");
    }


}
