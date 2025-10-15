package structural.adapter.problem.display;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        USB usb = new USB();
        HDMI hdmi = new HDMI();
        VGA vga = new VGA();

        List<Object> devices = new ArrayList<>();
        devices.add(usb);
        devices.add(hdmi);
        devices.add(vga);

        for (Object device : devices) {
            if (device instanceof USB) {
                ((USB) device).connetWithUsbCable("Video Data");
            } else if (device instanceof HDMI) {
                ((HDMI) device).connetWithHdmiCable(1080);
            } else if (device instanceof VGA) {
                ((VGA) device).connetWithVgaCable(true);
            }
        }

        System.out.println("새로운 디스플레이 타입을 추가하려면 또 다른 if-else가 필요함");
        System.out.println("각 디바이스마다 다른 메소드 이름과 파라미터 타입으로 인한 복잡성");
        System.out.println("타입 체크와 캐스팅으로 인한 코드 복잡도 증가");
    }
}

