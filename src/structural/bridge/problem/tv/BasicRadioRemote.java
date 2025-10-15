package structural.bridge.problem.tv;

public class BasicRadioRemote {
    private boolean radioPower = false;
    private int radioVolume = 5;
    
    public void power() {
        radioPower = !radioPower;
        System.out.println("Radio power: " + (radioPower ? "ON" : "OFF"));
    }
    
    public void volumeUp() {
        if (radioPower) {
            radioVolume++;
            System.out.println("Radio volume: " + radioVolume);
        }
    }
    
    public void volumeDown() {
        if (radioPower) {
            radioVolume--;
            System.out.println("Radio volume: " + radioVolume);
        }
    }
}