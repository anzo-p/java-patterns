package structural.decorator;

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
