package behavioral.observer.problem.news;

public class Client {
    
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        
        System.out.println("=== 첫 번째 뉴스 ===");
        agency.setNews("Breaking news: Observer Pattern in action!");
        
        System.out.println("\n=== Channel 2 비활성화 ===");
        agency.disableChannel2();
        agency.setNews("Second news: Channel 2 disabled.");
        
        System.out.println("\n=== Channel 2 재활성화 ===");
        agency.enableChannel2();
        agency.setNews("Third news: Channel 2 re-enabled.");
        
        System.out.println("\n문제점:");
        System.out.println("1. NewsAgency가 모든 채널 클래스에 직접 의존 (강결합)");
        System.out.println("2. 새로운 채널 추가 시 NewsAgency 클래스 수정 필요 (OCP 위반)");
        System.out.println("3. 채널을 동적으로 추가/제거하는 메커니즘이 복잡하고 비효율적");
        System.out.println("4. 채널 수가 늘어날수록 if문이 증가하여 복잡도 증가");
        System.out.println("5. NewsAgency가 존재하는 모든 채널을 알아야 함 (SRP 위반)");
        System.out.println("6. 런타임에 새로운 채널을 동적으로 추가할 수 없음");
        
        System.out.println("\n예시: 새로운 OnlineChannel을 추가하려면...");
        System.out.println("- NewsAgency에 OnlineChannel 필드 추가");
        System.out.println("- 생성자에서 OnlineChannel 초기화");
        System.out.println("- setNews()에서 onlineChannel.update() 호출 추가");
        System.out.println("- enable/disable 메소드들 추가");
        System.out.println("=> 기존 코드 대폭 수정 필요!");
    }
}