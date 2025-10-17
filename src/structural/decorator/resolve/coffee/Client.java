package structural.decorator.resolve.coffee;

public class Client {

    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(
            simpleCoffee.getDescription()
                + " $" + simpleCoffee.getCost()
        );

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(
            milkCoffee.getDescription()
                + " $" + milkCoffee.getCost()
        );

        SugarDecorator sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println(
            sugarCoffee.getDescription()
                + " $" + sugarCoffee.getCost()
        );
    }
}
