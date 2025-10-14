package behavioral.state.resolve.video;

public class VideoPlayer {

    private State state;

    public VideoPlayer() {
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        this.state = new PlayingState();
    }

    public void stop() {
        this.state = new StoppedState();
    }

}
