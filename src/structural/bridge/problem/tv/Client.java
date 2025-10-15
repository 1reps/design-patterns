package structural.bridge.problem.tv;

public class Client {
    
    public static void main(String[] args) {
        // 리모컨 타입 2개 x 디바이스 타입 2개 = 4개의 클래스 필요
        BasicTVRemote basicTV = new BasicTVRemote();
        AdvancedTVRemote advancedTV = new AdvancedTVRemote();
        BasicRadioRemote basicRadio = new BasicRadioRemote();
        AdvancedRadioRemote advancedRadio = new AdvancedRadioRemote();
        
        System.out.println("=== Basic TV Remote ===");
        basicTV.power();
        basicTV.volumeUp();
        
        System.out.println("\n=== Advanced TV Remote ===");
        advancedTV.power();
        advancedTV.volumeUp();
        advancedTV.channelUp();
        advancedTV.mute();
        
        System.out.println("\n=== Basic Radio Remote ===");
        basicRadio.power();
        basicRadio.volumeUp();
        
        System.out.println("\n=== Advanced Radio Remote ===");
        advancedRadio.power();
        advancedRadio.volumeUp();
        advancedRadio.frequencyUp();
        advancedRadio.mute();
        
        System.out.println("\n문제점:");
        System.out.println("1. 리모컨 타입 N개 x 디바이스 타입 M개 = N×M개의 클래스가 필요 (조합 폭발)");
        System.out.println("2. power(), volumeUp(), volumeDown() 로직이 모든 클래스에 중복");
        System.out.println("3. 새로운 디바이스(예: 스피커) 추가 시 모든 리모컨 타입에 대해 클래스 생성");
        System.out.println("4. 새로운 리모컨 타입 추가 시 모든 디바이스에 대해 클래스 생성");
        System.out.println("5. 추상화(리모컨)와 구현(디바이스)이 강하게 결합되어 독립적 확장 불가");
    }
}