package structural.decorator.toppings;

import structural.decorator.Pizza;
import structural.decorator.ToppingDecorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Tomato Sauce..");
    }

    public String getDescription() {
        return decorPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {
        return decorPizza.getCost() + 0.25;
    }
}
