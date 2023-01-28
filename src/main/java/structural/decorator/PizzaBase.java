package structural.decorator;

public class PizzaBase implements Pizza {

    public PizzaBase() {
        System.out.println("Starting pizza order");
    }

    public String getDescription() {
        return "Pizza";
    }

    public double getCost() {
        return 7.00;
    }
}