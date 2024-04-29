public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Create a Car
        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        vehicle1.create();

        // Create a Bike
        Vehicle vehicle2 = vehicleFactory.getVehicle("BIKE");
        vehicle2.create();

        // Create a Bus
        Vehicle vehicle3 = vehicleFactory.getVehicle("BUS");
        vehicle3.create();
    }
}