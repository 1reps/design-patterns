package creational.fatoryMethod.resolve.vehicle;

// Concrete creators
public class MotorcycleFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Motorcycle();
    }
}
