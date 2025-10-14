package behavioral.state.resolve.door;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();

        door.open();
        door.open();
        door.close();
        door.close();
    }
}
