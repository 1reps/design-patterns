package structural.flyweight.problem;

public class Client {

    public static void main(String[] args) {
        // Problem: Creating multiple Book objects for the same title
        // Each object consumes memory even when they represent the same book
        
        Book effectiveJava1 = new Book("Effective Java");
        effectiveJava1.read();
        
        Book effectiveJava2 = new Book("Effective Java"); // Another object for same title!
        effectiveJava2.read();
        
        Book cleanCode = new Book("Clean Code");
        cleanCode.read();
        
        Book effectiveJava3 = new Book("Effective Java"); // Yet another object!
        effectiveJava3.read();
        
        // Memory waste: Multiple objects for the same book title
        System.out.println("\nMemory comparison:");
        System.out.println("effectiveJava1 == effectiveJava2: " + (effectiveJava1 == effectiveJava2));
        System.out.println("effectiveJava1 == effectiveJava3: " + (effectiveJava1 == effectiveJava3));
        System.out.println("All objects are different instances, wasting memory!");
    }
}