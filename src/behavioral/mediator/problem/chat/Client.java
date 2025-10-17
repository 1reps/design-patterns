package behavioral.mediator.problem.chat;

public class Client {

    public static void main(String[] args) {
        // Problem: Client needs to manually manage all user relationships
        User john = new User("John");
        User jane = new User("Jane");
        User bob = new User("Bob");
        User alice = new User("Alice");

        // Problem: Complex setup - each user needs to know about others
        john.addContact(jane);
        john.addContact(bob);
        john.addContact(alice);
        
        jane.addContact(bob);
        jane.addContact(alice);
        
        bob.addContact(alice);

        System.out.println("=== Problem: Direct user communication ===");
        john.sendMessage("Hi everyone!");
        
        System.out.println("\n=== Problem: Direct messaging ===");
        jane.sendDirectMessage("Hello John", john);
        
        System.out.println("\n=== Problem: Managing group changes ===");
        john.removeContact(bob);
        bob.sendMessage("Can everyone still hear me?"); // Bob doesn't know John removed him
        
        System.out.println("\nProblems demonstrated:");
        System.out.println("1. N-to-N coupling - every user knows every other user");
        System.out.println("2. Complex relationship management in client code");
        System.out.println("3. Users handle message distribution logic themselves");
        System.out.println("4. Difficult to add features like message history, filtering, etc.");
        System.out.println("5. Inconsistent state when relationships change");
    }
}