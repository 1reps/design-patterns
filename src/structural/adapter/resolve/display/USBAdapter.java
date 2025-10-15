package structural.adapter.resolve.display;

public class USBAdapter implements DisplayAdapter {

    private USB usb;
    private String data;

    public USBAdapter(USB usb, String data) {
        this.usb = usb;
        this.data = data;
    }

    @Override
    public void display() {
        usb.connetWithUsbCable(data);
    }
}
