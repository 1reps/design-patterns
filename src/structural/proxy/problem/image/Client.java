package structural.proxy.problem.image;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("=== 이미지 객체 생성 시 ===");
        RealImage image1 = new RealImage("photo1.jpg");
        RealImage image2 = new RealImage("photo2.jpg");
        RealImage image3 = new RealImage("photo3.jpg");
        
        System.out.println("\n=== 파일명만 확인하고 싶었는데... ===");
        System.out.println("File 1: " + image1.getFileName());
        System.out.println("File 2: " + image2.getFileName());
        System.out.println("File 3: " + image3.getFileName());
        
        System.out.println("\n=== 실제로 display는 하나만 함 ===");
        image1.display();
        
        System.out.println("\n문제점:");
        System.out.println("1. 객체 생성 시 무조건 비싼 로딩 작업 수행 (Eager Loading)");
        System.out.println("2. 메타데이터만 필요한 경우에도 전체 리소스 로딩");
        System.out.println("3. 메모리 낭비: 사용하지 않을 이미지도 모두 로드됨");
        System.out.println("4. 성능 저하: 불필요한 I/O 작업으로 앱 시작 시간 증가");
        System.out.println("5. 확장성 부족: 캐싱, 로깅 등 부가 기능 추가 어려움");
    }
}