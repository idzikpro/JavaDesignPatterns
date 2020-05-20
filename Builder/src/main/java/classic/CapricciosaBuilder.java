package classic;

import java.util.Arrays;

public class CapricciosaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public void reset() {
        this.pizza = new Pizza();
    }

    public void buildDough() {
        this.pizza.setDough("thick rust");
    }

    public void buildSauce() {
        this.pizza.setSauce("tomato sauce");
    }

    public void addToppings() {
        this.pizza.setToppings(Arrays.asList("sirloin", "black olives", "mushrooms", "oregano"));
    }

    public Pizza getPizza() {
        return pizza;
    }
}
