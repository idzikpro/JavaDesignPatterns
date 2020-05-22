package decorator;

public class BaconDecorator extends PizzaDecorator {
    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}