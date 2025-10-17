package behavioral.visitor.problem;

// Problem: Shape needs to know about all possible operations
public abstract class Shape {

    // Problem: Every time we add a new operation, we need to modify this class
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // Problem: What if we want to add volume calculation? 
    // We would need to modify this class and all subclasses
    // public abstract double calculateVolume(); // This would break existing code
    
    // Problem: What if we want to add drawing functionality?
    // public abstract void draw(); // Again, all subclasses need modification
    
    // Problem: What if we want to add serialization?
    // public abstract String serialize(); // More modifications required
}