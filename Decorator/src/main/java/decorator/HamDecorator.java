package decorator;

public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }
}