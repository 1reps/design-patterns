package structural.bridge.problem.tv;

public class AdvancedRadioRemote {
    private boolean radioPower = false;
    private int radioVolume = 5;
    private double radioFrequency = 88.0;
    
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
    
    public void frequencyUp() {
        if (radioPower) {
            radioFrequency += 0.1;
            System.out.println("Radio frequency: " + radioFrequency);
        }
    }
    
    public void frequencyDown() {
        if (radioPower) {
            radioFrequency -= 0.1;
            System.out.println("Radio frequency: " + radioFrequency);
        }
    }
    
    public void mute() {
        if (radioPower) {
            System.out.println("Radio muted");
        }
    }
}