package structural.decorator.toppings;

import structural.decorator.Pizza;
import structural.decorator.ToppingDecorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Mozzarella..");
    }

    public String getDescription() {
        return decorPizza.getDescription() + ", Mozzarella";
    }

    public double getCost() {
        return decorPizza.getCost() + 0.50;
    }
}
