public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("BUS")) {
            return new Bus();
        }
        return null;
    }
}