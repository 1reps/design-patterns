package creational.fatoryMethod.problem.product;

public class Client {
    
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        
        Product electronics = manager.orderProduct("electronics");
        Product clothing = manager.orderProduct("clothing");
        Product book = manager.orderProduct("book");
        
        System.out.println("\n문제점:");
        System.out.println("1. 새로운 제품 타입 추가 시 ProductManager의 createProduct() 수정 필요 (OCP 위반)");
        System.out.println("2. 모든 객체 생성 로직이 한 클래스에 집중되어 SRP 위반");
        System.out.println("3. 클라이언트가 구체적인 제품 클래스들을 알아야 함");
        System.out.println("4. 조건문이 늘어나면서 코드 복잡도 증가");
        System.out.println("5. 제품별 특수한 생성 로직을 다루기 어려움");
        
        // 새로운 제품 타입 추가 시뮬레이션
        try {
            Product furniture = manager.orderProduct("furniture");
        } catch (IllegalArgumentException e) {
            System.out.println("6. 새로운 타입 'furniture' 추가하려면 ProductManager 수정 필요: " + e.getMessage());
        }
    }
}