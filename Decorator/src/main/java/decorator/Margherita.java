package decorator;

public class Margherita implements Pizza {
    @Override
    public int getCost() {
        return 10;
    }
}