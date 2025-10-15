package creational.fatoryMethod.resolve.product;

// ProductFactory class
public abstract class ProductFactory {

    // Factory Method
    public abstract Product createProduct(String type);

    public Product orderProduct(String type) {
        Product product = createProduct(type);
        product.create();
        return product;
    }

}
