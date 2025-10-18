package behavioral.publisherSubscriber.problem.marketing;

public class Customer {
    private String name;
    private String email;
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public void receivePromotion(String type, String message) {
        System.out.println(name + " (" + email + ")이 " + type + " 프로모션을 받음: " + message);
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
}