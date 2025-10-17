package structural.adapter.resolve.sender;

public class Client {

    public static void main(String[] args) {
        OldMessageSystem oldSystem = new OldMessageSystem();
        MessageAdapter adapter = new MessageAdapter(oldSystem);

        adapter.sendMessage("Hello, World", "john@example.com");
    }
}
