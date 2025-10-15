package creational.fatoryMethod.problem.product;

public class ProductManager {
    
    public Product createProduct(String type) {
        // 모든 객체 생성 로직이 한 곳에 집중
        if (type.equalsIgnoreCase("electronics")) {
            return new Electronics();
        } else if (type.equalsIgnoreCase("clothing")) {
            return new Clothing();
        } else if (type.equalsIgnoreCase("book")) {
            return new Book();
        } else {
            throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
    
    public Product orderProduct(String type) {
        Product product = createProduct(type);
        product.create();
        return product;
    }
}