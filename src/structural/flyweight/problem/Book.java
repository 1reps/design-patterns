package structural.flyweight.problem;

// Problem: Creating new Book objects every time without sharing
public class Book {

    private final String title;
    private final String content; // Heavy data that could be shared

    public Book(String title) {
        this.title = title;
        this.content = loadContent(title); // Simulate loading heavy content
        System.out.println("Creating a new Book object for: " + title);
    }

    private String loadContent(String title) {
        // Simulate heavy content loading
        return "Heavy content for " + title + " - Lorem ipsum dolor sit amet...";
    }

    public void read() {
        System.out.println("Reading the book titled: " + title);
        System.out.println("Content preview: " + content.substring(0, 50) + "...");
    }
}