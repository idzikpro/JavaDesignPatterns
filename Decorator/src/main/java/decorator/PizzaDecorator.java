package decorator;

public class PizzaDecorator implements Pizza {
    private Pizza pizza;

    @Override
    public int getCost() {
        return pizza.getCost();
    }

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}