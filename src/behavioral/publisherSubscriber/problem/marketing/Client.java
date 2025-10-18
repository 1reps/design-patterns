package behavioral.publisherSubscriber.problem.marketing;

public class Client {
    
    public static void main(String[] args) {
        MarketingService marketingService = new MarketingService();
        
        Customer customer1 = new Customer("김철수", "kim@email.com");
        Customer customer2 = new Customer("이영희", "lee@email.com");
        Customer customer3 = new Customer("박민수", "park@email.com");
        Customer customer4 = new Customer("최지영", "choi@email.com");
        
        marketingService.addRegularCustomer(customer1);
        marketingService.addPremiumCustomer(customer2);
        marketingService.addVipCustomer(customer3);
        marketingService.addPremiumCustomer(customer4);
        
        System.out.println("=== 타겟별 프로모션 발송 ===");
        marketingService.sendRegularPromotion("일반 고객 10% 할인 쿠폰");
        marketingService.sendPremiumPromotion("프리미엄 고객 20% 할인 쿠폰");
        marketingService.sendVipPromotion("VIP 고객 30% 할인 + 무료배송");
        
        System.out.println("\n=== 전체 공지사항 발송 ===");
        marketingService.sendGeneralAnnouncement("서비스 점검 안내: 내일 오전 2시-4시");
        
        System.out.println("\n문제점:");
        System.out.println("1. 새로운 고객 등급(예: 골드, 실버) 추가 시 MarketingService 클래스 대폭 수정 필요");
        System.out.println("   - 새로운 List<Customer> 필드 추가");
        System.out.println("   - add/remove 메소드 추가");
        System.out.println("   - send 메소드 추가");
        System.out.println("   - sendGeneralAnnouncement 메소드에 새 등급 추가");
        System.out.println("2. 고객 등급별로 하드코딩된 메소드들로 인한 확장성 부족 (OCP 위반)");
        System.out.println("3. 코드 중복: 각 등급마다 유사한 패턴의 메소드들이 반복됨");
        System.out.println("4. 전체 발송 시 모든 등급을 일일이 나열해야 함 (유지보수성 저하)");
        System.out.println("5. 등급 수가 늘어날수록 클래스가 비대해지고 복잡도 증가 (SRP 위반)");
        System.out.println("6. 런타임에 동적으로 새로운 고객 등급을 추가할 수 없음");
        
        System.out.println("\n예시: 골드 고객 등급을 추가하려면...");
        System.out.println("- List<Customer> goldCustomers 필드 추가");
        System.out.println("- addGoldCustomer(), removeGoldCustomer() 메소드 추가");
        System.out.println("- sendGoldPromotion() 메소드 추가");
        System.out.println("- sendGeneralAnnouncement()에 goldCustomers 루프 추가");
        System.out.println("=> 기존 코드 수정 불가피!");
    }
}