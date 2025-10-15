package structural.proxy.problem.bank;

public class Client {
    
    public static void main(String[] args) {
        RealBankAccount adminAccount = new RealBankAccount(1000, "Admin");
        adminAccount.deposit(500);
        adminAccount.withdraw(300);
        
        RealBankAccount userAccount = new RealBankAccount(1000, "User");
        userAccount.deposit(500);
        userAccount.withdraw(300);
        
        System.out.println("\n문제점:");
        System.out.println("1. 접근 제어 로직이 핵심 비즈니스 로직(RealBankAccount)에 섞여있음");
        System.out.println("2. SRP 위반: 계좌 관리와 접근 제어 책임이 한 클래스에 있음");
        System.out.println("3. 새로운 접근 제어 규칙 추가 시 핵심 클래스 수정 필요");
        System.out.println("4. 로깅, 캐싱 등 부가 기능 추가 시 핵심 클래스가 복잡해짐");
        System.out.println("5. 테스트 시 부가 기능을 제외한 핵심 로직만 테스트하기 어려움");
    }
}