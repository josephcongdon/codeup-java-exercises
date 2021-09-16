package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[3];
        cars[0] = new Hatchback();
        cars[0].setName("hatchback");

        cars[1] = new Sedan();
        cars[1].setName("sedan");

        cars[2] = new Sedan("mazda");
        cars[2].setName("MX5");

        Garage carlot = new Garage();
        carlot.findParkedVehicle(cars);
    }


}
