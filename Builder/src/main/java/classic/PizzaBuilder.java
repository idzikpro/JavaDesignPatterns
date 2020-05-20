package classic;

public interface PizzaBuilder {
    void reset();

    void buildDough();

    void buildSauce();

    void addToppings();
}