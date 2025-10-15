package structural.bridge.resolve.sender;

public class EncryptMessage extends Message {

    public EncryptMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        messageSender.sendMessage(
            "Encrypted Message: " + encryptedMessage
        );
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}
