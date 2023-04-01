package structural.decorator.toppings;

import structural.decorator.Pizza;
import structural.decorator.ToppingDecorator;

public class Dough extends ToppingDecorator {

    public Dough(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough..");
    }

    public String getDescription() {
        return decorPizza.getDescription() + ", Dough";
    }

    public double getCost() {
        return decorPizza.getCost() + 1.05;
    }
}
