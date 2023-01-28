package structural.decorator;

abstract class ToppingDecorator implements Pizza {

    protected Pizza decorPizza;

    public ToppingDecorator(Pizza newPizza) {
        decorPizza = newPizza;
    }

    public String getDescription() {
        return decorPizza.getDescription();
    }

    public double getCost() {
        return decorPizza.getCost();
    }
}

