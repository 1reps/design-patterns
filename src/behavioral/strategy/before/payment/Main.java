package behavioral.strategy.before.payment;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.checkout(10000, "CREDIT");
        cart.checkout(20000, "PAYPAL");
    }
}

