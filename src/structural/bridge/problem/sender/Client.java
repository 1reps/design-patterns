package structural.bridge.problem.sender;

public class Client {
    
    public static void main(String[] args) {
        String message = "Hello World";
        
        // 메시지 타입 2개 x 전송 방식 2개 = 4개의 클래스 필요
        EmailTextMessage emailText = new EmailTextMessage();
        EmailEncryptMessage emailEncrypt = new EmailEncryptMessage();
        SMSTextMessage smsText = new SMSTextMessage();
        SMSEncryptMessage smsEncrypt = new SMSEncryptMessage();
        
        emailText.send(message);
        emailEncrypt.send(message);
        smsText.send(message);
        smsEncrypt.send(message);
        
        System.out.println("\n문제점:");
        System.out.println("1. 메시지 타입 N개 x 전송 방식 M개 = N×M개의 클래스가 필요 (조합 폭발)");
        System.out.println("2. 새로운 메시지 타입 추가 시 모든 전송 방식에 대해 클래스 생성 필요");
        System.out.println("3. 새로운 전송 방식 추가 시 모든 메시지 타입에 대해 클래스 생성 필요");
        System.out.println("4. 암호화 로직 중복 (EmailEncryptMessage, SMSEncryptMessage)");
        System.out.println("5. 코드 유지보수성 저하 및 확장성 문제");
    }
}