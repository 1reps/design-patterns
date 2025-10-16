package behavioral.observer.problem.weather;

public class Client {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        // 첫 번째 날씨 업데이트
        weatherData.setMeasurements(80, 65, 30.4f);
        
        System.out.println("\n문제점:");
        System.out.println("1. WeatherData가 모든 디스플레이 클래스에 직접 의존 (강결합)");
        System.out.println("2. 새로운 디스플레이 추가 시 WeatherData 클래스 수정 필요 (OCP 위반)");
        System.out.println("3. 디스플레이를 동적으로 추가/제거할 수 없음");
        System.out.println("4. 디스플레이 객체들이 WeatherData 생성자에서 하드코딩됨");
        System.out.println("5. WeatherData가 어떤 디스플레이들이 존재하는지 알아야 함 (SRP 위반)");
        System.out.println("6. 테스트 시 특정 디스플레이만 테스트하기 어려움");
        
        System.out.println("\n예시: 새로운 MobileDisplay를 추가하려면...");
        System.out.println("- WeatherData 클래스에 MobileDisplay 필드 추가");
        System.out.println("- 생성자에서 MobileDisplay 초기화");
        System.out.println("- setMeasurements()에서 mobileDisplay.update() 호출 추가");
        System.out.println("=> 기존 코드 수정 필요!");
    }
}