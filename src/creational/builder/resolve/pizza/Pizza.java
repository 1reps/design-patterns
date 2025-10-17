package creational.builder.resolve.pizza;

class Pizza {

    private String dough;
    private String sauce;
    private String topping;

    // Private constructor to enforce the use of Builder
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "dough='" + dough + '\'' +
            ", sauce='" + sauce + '\'' +
            ", topping='" + topping + '\'' +
            '}';
    }

    public static class PizzaBuilder {

        private String dough;
        private String sauce;
        private String topping;

        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

}
