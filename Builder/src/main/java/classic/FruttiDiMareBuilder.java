package classic;

import java.util.Arrays;

public class FruttiDiMareBuilder implements PizzaBuilder {
    private Pizza pizza;

    public void reset() {
        this.pizza=new Pizza();
    }

    public void buildDough() {
        this.pizza.setDough("thin rust");
    }

    public void buildSauce() {
        this.pizza.setSauce("tomato sauce");
    }

    public void addToppings() {
        this.pizza.setToppings(Arrays.asList("tuna", "shrimp", "mussels", "garlic", "oregano"));
    }

    public Pizza getPizza() {
        return pizza;
    }
}
