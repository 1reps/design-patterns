package creational.fatoryMethod.resolve.product;

public class Client {

    public static void main(String[] args) {
        ProductFactory factory = new ConcreteProductFactory();

        // Create an electronics product
        Product electronics = factory.orderProduct("electronics");

        // Create a clothing product
        Product clothing = factory.orderProduct("clothing");

        // Create a book product
        Product book = factory.orderProduct("book");

        // Unknown Exception
        try {
            Product unknown = factory.orderProduct("unknown");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }
}
