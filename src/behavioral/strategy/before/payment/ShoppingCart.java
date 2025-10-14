package behavioral.strategy.before.payment;

public class ShoppingCart {

    public void checkout(int amount, String method) {
        if ("CREDIT".equals(method)) {
            System.out.println("Paying " + amount + " by credit card.");
            // credit-card specific validation/processing duplicated here
        } else if ("PAYPAL".equals(method)) {
            System.out.println("Paying " + amount + " by PayPal.");
            // PayPal-specific logic duplicated here
        } else {
            System.out.println("Unknown payment method: " + method);
        }
    }
}

