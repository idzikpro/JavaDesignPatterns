package classic;

public class PizzaMain {
    public static void main(String[] args) {
        CapricciosaBuilder capricciosaBuilder =new CapricciosaBuilder();
        PizzaDirector pizzaDirector = new PizzaDirector(capricciosaBuilder);
        pizzaDirector.build();
        System.out.println(capricciosaBuilder.getPizza());
    }
}