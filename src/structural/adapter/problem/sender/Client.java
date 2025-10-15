package structural.adapter.problem.sender;

public class Client {

    public static void main(String[] args) {
        OldMessageSender sender = new OldMessageSystem();
        String[] messageData = {"Hello, World", "john@example.com"};
        int result = sender.sent(messageData);

        if (result != 1) {
            System.out.println("Failed to send message");
        }
    }
}

