package behavioral.strategy.resolve.payment;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(
            new CreditCardPayment("John Doe", "12345678798")
        );

        cart.checkout(100);

        cart.setPaymentStrategy(
            new PayPalPayment("johndoe@example.com")
        );

        cart.checkout(200);
    }
}
