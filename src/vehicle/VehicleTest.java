package vehicle;

public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle camry = new Vehicle();
//        camry.setName("camry");
        Vehicle camry = new Vehicle("Camry");
        System.out.println(camry.getName());
        camry.makeNoise();


//        Truck rivian = new Truck();
//        rivian.setName("Rivian");
//        Vehicle rivian = new Truck("Rivian");
//        System.out.println(rivian.getName());
//        rivian.makeNoise();
//
//        Vehicle hilux = new Truck("Hilux");
//        System.out.println(hilux.getName());
//        hilux.makeNoise();

        Sedan mazda = new Sedan();
        mazda.name = "mazda";
        mazda.makeNoise();
    }
}
