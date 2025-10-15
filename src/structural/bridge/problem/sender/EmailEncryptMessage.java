package structural.bridge.problem.sender;

public class EmailEncryptMessage {
    
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        System.out.println("Sending email with Encrypted Message: " + encryptedMessage);
    }
    
    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}