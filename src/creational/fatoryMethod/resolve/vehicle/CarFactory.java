package creational.fatoryMethod.resolve.vehicle;

// Concrete creators
public class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
