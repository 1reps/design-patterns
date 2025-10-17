package behavioral.visitor.problem;

public class Client {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0),
            new Rectangle(4.0, 6.0),
            new Circle(3.0)
        };

        System.out.println("=== Calculating Areas ===");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

        System.out.println("\n=== Calculating Perimeters ===");
        for (Shape shape : shapes) {
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }

        // Problem: What if we want to add a new operation like "export to JSON"?
        // We would need to:
        // 1. Add abstract method to Shape class
        // 2. Implement the method in Circle class
        // 3. Implement the method in Rectangle class
        // 4. Potentially break existing code that extends Shape
        
        // Problem: What if we want different formatting for the same operation?
        // e.g., area in square meters vs square feet
        // We would need multiple methods or complex parameters
        
        System.out.println("\nProblems demonstrated:");
        System.out.println("1. Open-Closed Principle violation - adding operations requires modifying existing classes");
        System.out.println("2. Single Responsibility Principle violation - shapes know about calculations AND presentation");
        System.out.println("3. Difficult to add new operations without changing existing stable code");
        System.out.println("4. All shape classes must implement all operations, even if not relevant");
    }
}