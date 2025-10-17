package behavioral.visitor.problem;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Problem: If we add a new operation like volume calculation,
    // we need to modify this class even though it doesn't conceptually
    // belong to Circle (mixing concerns)
    
    // Problem: If we want to add printing functionality:
    // public void printDetails() {
    //     System.out.println("Circle with radius: " + radius);
    // }
    // This mixes presentation logic with domain logic
}