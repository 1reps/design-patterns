package behavioral.state.problem.video;

public class VideoPlayer {

    private String state;

    public VideoPlayer(String state) {
        this.state = state;
    }

    public void play() {
        if ("Stopped".equals(state)) {
            System.out.println("Starting the video.");
            state = "Playing";
        } else if ("Playing".equals(state)) {
            System.out.println("Video is already playing.");
        } else if ("Paused".equals(state)) {
            System.out.println("Resuming the video.");
            state = "Playing";
        }
    }

    public void stop() {
        if ("Playing".equals(state)) {
            System.out.println("Pausing the video.");
            state = "Paused";
        } else if ("Paused".equals(state)) {
            System.out.println("Stopping the video.");
            state = "Stopped";
        } else if ("Stopped".equals(state)) {
            System.out.println("Video is already stopped.");
        }
    }
}
