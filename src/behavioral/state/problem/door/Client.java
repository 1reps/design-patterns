package behavioral.state.problem.door;

public class Client {

    public static void main(String[] args) {
        Door door = new Door("Closed");
        door.open();
        door.open();
        door.close();
        door.close();
    }
}
