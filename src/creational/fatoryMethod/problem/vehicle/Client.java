package creational.fatoryMethod.problem.vehicle;

public class Client {
    
    public static void main(String[] args) {
        VehicleDeliveryService service = new VehicleDeliveryService();
        
        service.deliverVehicle("car");
        service.deliverVehicle("motorcycle");
        
        System.out.println("\n문제점:");
        System.out.println("1. 새로운 차량 타입 추가 시 VehicleDeliveryService의 createVehicle() 수정 필요");
        System.out.println("2. 차량별 특수한 배송 로직을 구현하기 어려움");
        System.out.println("3. 하나의 클래스가 모든 차량 생성 책임을 가짐 (SRP 위반)");
        System.out.println("4. 확장에 대해 닫혀있음 (OCP 위반)");
        System.out.println("5. 조건문 증가로 인한 복잡도 증가");
        
        // 새로운 차량 타입 추가 시뮬레이션
        try {
            service.deliverVehicle("truck");
        } catch (IllegalArgumentException e) {
            System.out.println("6. 새로운 타입 'truck' 추가하려면 VehicleDeliveryService 수정 필요: " + e.getMessage());
        }
    }
}