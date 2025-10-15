package structural.bridge.resolve.tv;

// Implementor
public interface Device {

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    boolean isEnabled();

}
