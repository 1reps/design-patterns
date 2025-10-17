package behavioral.mediator.problem.chat;

import java.util.ArrayList;
import java.util.List;

// Problem: User directly manages references to other users
public class User {

    private String name;
    private List<User> contacts; // Direct references to other users

    public User(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    // Problem: Each user needs to know about all other users
    public void addContact(User user) {
        contacts.add(user);
        user.contacts.add(this); // Bidirectional coupling
    }

    // Problem: User handles message distribution logic
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        
        // Problem: User needs to iterate through all contacts
        for (User contact : contacts) {
            contact.receive(message, this);
        }
    }

    // Problem: Direct communication between users
    public void sendDirectMessage(String message, User recipient) {
        System.out.println(name + " sends direct message to " + recipient.name + ": " + message);
        recipient.receive(message, this);
    }

    public void receive(String message, User sender) {
        System.out.println(name + " receives from " + sender.name + ": " + message);
    }

    public String getName() {
        return name;
    }

    // Problem: User needs to manage group operations
    public void removeContact(User user) {
        contacts.remove(user);
        user.contacts.remove(this);
    }
}