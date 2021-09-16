package vehicle;

public class Garage {
    public void findParkedVehicle( Vehicle[] allVehiclesInGarage){
        for(Vehicle vehicle: allVehiclesInGarage){
            System.out.println(vehicle.getName() + " goes ");
            vehicle.makeNoise();
            System.out.println("your " + vehicle.name + " got hit ");
            vehicle.makeAlarm();
        }
    }
}
