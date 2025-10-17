package creational.builder.resolve.pizza;

import creational.builder.resolve.pizza.Pizza.PizzaBuilder;

public class Client {

    public static void main(String[] args) {
        Pizza newPizza = new PizzaBuilder()
            .dough("Thin Crust")
            .sauce("Tomato")
            .topping("Cheese")
            .build();

        System.out.println(newPizza);

        String orderType = "Veggie";

        PizzaBuilder regularPizza = new PizzaBuilder()
            .dough("Regular");

        regularPizza.sauce("Pesto");

        if ("Veggie".equals(orderType)) {
            regularPizza.topping("Vegetables");
        } else {
            regularPizza.topping("Pepperoni");
        }

        Pizza customPizza = regularPizza.build();
        System.out.println(customPizza);
    }
}
