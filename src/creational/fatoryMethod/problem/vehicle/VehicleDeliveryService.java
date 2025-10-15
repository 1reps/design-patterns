package creational.fatoryMethod.problem.vehicle;

public class VehicleDeliveryService {
    
    public Vehicle createVehicle(String type) {
        // 모든 차량 생성 로직이 한 곳에 집중
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
    
    public void deliverVehicle(String type) {
        Vehicle vehicle = createVehicle(type);
        System.out.println("Delivering the vehicle:");
        vehicle.drive();
    }
}