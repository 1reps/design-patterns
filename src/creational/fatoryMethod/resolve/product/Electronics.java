package creational.fatoryMethod.resolve.product;

public class Electronics implements Product {

    @Override
    public void create() {
        System.out.println("Electronics product created.");
    }
}
