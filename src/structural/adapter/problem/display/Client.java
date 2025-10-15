package structural.adapter.problem.display;

public class Client {

    public static void main(String[] args) {
        USB usb = new USB();
        HDMI hdmi = new HDMI();
        VGA vga = new VGA();

        usb.connetWithUsbCable("Video Data");
        hdmi.connetWithHdmiCable(1080);
        vga.connetWithVgaCable(true);
    }
}

