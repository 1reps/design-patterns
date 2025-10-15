package creational.fatoryMethod.resolve.product;

public class Clothing implements Product{

    @Override
    public void create() {
        System.out.println("Clothing product created.");
    }
}
