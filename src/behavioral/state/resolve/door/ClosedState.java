package behavioral.state.resolve.door;

public class ClosedState implements State {

    @Override
    public void open(Door door) {
        System.out.println("Door in now Open.");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is already Closed.");
    }
}
