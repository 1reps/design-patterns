package behavioral.strategy.problem.payment;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.checkout(10000, "CREDIT");
        cart.checkout(20000, "PAYPAL");
    }
}
