package behavioral.state.problem.door;

public class Main {

    public static void main(String[] args) {
        Door door = new Door("Closed");
        door.open();
        door.open();
        door.close();
        door.close();
    }
}
