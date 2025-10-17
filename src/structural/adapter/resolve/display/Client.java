package structural.adapter.resolve.display;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        USB usb = new USB();
        HDMI hdmi = new HDMI();
        VGA vga = new VGA();

        List<DisplayAdapter> adapters = new ArrayList<DisplayAdapter>();
        adapters.add(new USBAdapter(usb, "Video Data"));
        adapters.add(new HDMIAdapter(hdmi, 1080));
        adapters.add(new VGAAdapter(vga, true));

        adapters.forEach(DisplayAdapter::display);
    }
}
