package behavioral.templateMethod.resolve.beverage;

public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        Tea tea = new Tea();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking beverage...");
        beverage.prepareRecipe();
    }
}
