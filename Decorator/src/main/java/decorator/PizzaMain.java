package decorator;

public class PizzaMain {
    public static void main(String[] args) {
        Margherita margherita = new Margherita();
        BaconDecorator baconDecorator = new BaconDecorator(margherita);
        HamDecorator hamDecorator = new HamDecorator(baconDecorator);
        System.out.println("The cost is" + hamDecorator.getCost());
    }
}