package structural.bridge.problem.tv;

public class BasicTVRemote {
    private boolean tvPower = false;
    private int tvVolume = 10;
    
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
}