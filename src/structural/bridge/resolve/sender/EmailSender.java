package structural.bridge.resolve.sender;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
