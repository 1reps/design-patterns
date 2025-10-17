package behavioral.visitor.resolve;

public class Client {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0),
            new Rectangle(4.0, 6.0),
            new Circle(3.0)
        };

        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        System.out.println("=== Calculating Areas ===");
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }

        System.out.println("\n=== Calculating Perimeters ===");
        for (Shape shape : shapes) {
            shape.accept(perimeterVisitor);
        }
    }
}