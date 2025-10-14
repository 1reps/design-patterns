package structural.facade.before.smarthome;

public class Client {

    public static void main(String[] args) {
        // 하위 컴포넌트를 직접 제어 (시나리오 로직이 분산되고 중복됨)
        System.out.println("Waking up...");
        System.out.println("Setting thermostat to 22 degrees.");
        System.out.println("Lights are on.");
        System.out.println("Brewing coffee.");

        System.out.println("Leaving home...");
        System.out.println("Setting thermostat to 18 degrees.");
        System.out.println("Lights are off.");
    }
}

