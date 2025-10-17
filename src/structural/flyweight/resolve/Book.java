package structural.flyweight.resolve;

// Flyweight class
public class Book {

    private final String title; // intrinsic state (shared)

    public Book(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("Reading the book titled: " + title);
    }
}
