package creational.fatoryMethod.resolve.vehicle;

// Creator abstract class
abstract class VehicleFactory {

    // Factory method
    abstract Vehicle createVehicle();

    // Operations using the factory method
    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        System.out.println("Delivering the vehicle:");
        vehicle.drive();
    }
}
