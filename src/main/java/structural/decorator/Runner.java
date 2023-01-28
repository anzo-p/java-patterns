package structural.decorator;

/*
    Decorator
    - Modify object dynamically in a composition-like way through class constructors
    - Supports the idea of many simple modifying classes
    - Rather than rewrite, extend with new code

    Adding a new decorator means extending a new decorator-class
    - By default it may be composed-constructed-in in any order
 */

public class Runner {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new Dough(new PizzaBase())));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Total price: " + basicPizza.getCost());
    }
}
