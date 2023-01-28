package behavioral.strategy;

/*
    Strategy Pattern:
    - When you need to choose one variation of a feature dynamically in an enum-like way
    - Often removes much need for nested conditionals

    Adding a new variation means adding another Strategy class

    Would it be the same if they were mixed-in?
 */

import behavioral.strategy.models.Animal;
import behavioral.strategy.models.Bird;
import behavioral.strategy.models.Dog;
import behavioral.strategy.strategies.CanFly;

public class Runner {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("sparky is a dog and " + sparky.tryToFly());
        System.out.println("tweety is a bird and " + tweety.tryToFly());

        sparky.setFlyingType(new CanFly());
        System.out.println("sparky ascended and now " + sparky.tryToFly());
    }
}
