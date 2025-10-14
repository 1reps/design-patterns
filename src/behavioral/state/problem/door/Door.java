package behavioral.state.problem.door;

public class Door {

    private String state;

    public Door(String initialState) {
        this.state = initialState; // "Open" or "Closed"
    }

    public void open() {
        if ("Closed".equals(state)) {
            System.out.println("Door is now Open.");
            state = "Open";
        } else if ("Open".equals(state)) {
            System.out.println("Door is already Open.");
        }
    }

    public void close() {
        if ("Open".equals(state)) {
            System.out.println("Door is now Closed.");
            state = "Closed";
        } else if ("Closed".equals(state)) {
            System.out.println("Door is already Closed.");
        }
    }
}
