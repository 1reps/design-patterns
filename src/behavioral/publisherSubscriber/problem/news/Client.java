package behavioral.publisherSubscriber.problem.news;

public class Client {
    
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        
        NewsSubscriber subscriber1 = new NewsSubscriber("구독자1");
        NewsSubscriber subscriber2 = new NewsSubscriber("구독자2");
        NewsSubscriber subscriber3 = new NewsSubscriber("구독자3");
        
        publisher.subscribeSports(subscriber1);
        publisher.subscribeWeather(subscriber1);
        
        publisher.subscribeSports(subscriber2);
        publisher.subscribePolitics(subscriber2);
        
        publisher.subscribeWeather(subscriber3);
        
        System.out.println("=== 뉴스 발행 ===");
        publisher.publishSportsNews("리버풀이 챔피언스리그에서 승리했습니다!");
        publisher.publishWeatherNews("내일은 맑을 예정입니다.");
        publisher.publishPoliticsNews("새로운 정책이 발표되었습니다.");
        
        System.out.println("\n문제점:");
        System.out.println("1. 새로운 토픽(예: 경제뉴스) 추가 시 NewsPublisher 클래스 대폭 수정 필요");
        System.out.println("   - 새로운 List<NewsSubscriber> 필드 추가");
        System.out.println("   - subscribe/unsubscribe 메소드 추가");
        System.out.println("   - publish 메소드 추가");
        System.out.println("2. 토픽별로 하드코딩된 메소드들로 인한 확장성 부족 (OCP 위반)");
        System.out.println("3. 코드 중복: 각 토픽마다 유사한 패턴의 메소드들이 반복됨");
        System.out.println("4. 런타임에 동적으로 새로운 토픽을 추가할 수 없음");
        System.out.println("5. 토픽 수가 늘어날수록 클래스가 비대해지고 복잡도 증가 (SRP 위반)");
        
        System.out.println("\n예시: 경제뉴스 토픽을 추가하려면...");
        System.out.println("- List<NewsSubscriber> economySubscribers 필드 추가");
        System.out.println("- subscribeEconomy(), unsubscribeEconomy() 메소드 추가");
        System.out.println("- publishEconomyNews() 메소드 추가");
        System.out.println("=> 기존 코드 수정 불가피!");
    }
}