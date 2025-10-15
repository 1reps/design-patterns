package structural.bridge.problem.tv;

public class AdvancedTVRemote {
    private boolean tvPower = false;
    private int tvVolume = 10;
    private int tvChannel = 1;
    
    public void power() {
        tvPower = !tvPower;
        System.out.println("TV power: " + (tvPower ? "ON" : "OFF"));
    }
    
    public void volumeUp() {
        if (tvPower) {
            tvVolume++;
            System.out.println("TV volume: " + tvVolume);
        }
    }
    
    public void volumeDown() {
        if (tvPower) {
            tvVolume--;
            System.out.println("TV volume: " + tvVolume);
        }
    }
    
    public void channelUp() {
        if (tvPower) {
            tvChannel++;
            System.out.println("TV channel: " + tvChannel);
        }
    }
    
    public void channelDown() {
        if (tvPower) {
            tvChannel--;
            System.out.println("TV channel: " + tvChannel);
        }
    }
    
    public void mute() {
        if (tvPower) {
            System.out.println("TV muted");
        }
    }
}