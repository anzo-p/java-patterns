package behavioral.strategy;

/*
    Strategy Pattern

    Key concepts
    - When you need to choose one variation of a feature dynamically in an enum-like way
    - Often removes much need for nested conditionals

    Key Objects
        Strategy

    Adding a new Strategy
    - Implement another Strategy class

    In practice
        An Object of interest has some feature of its behavior implemented into a Strategy
        The Strategies are various ways of handling that feature
        The chosen Strategy is initialized and passed to that object on its creation
        The strategy may be changed at any time, though preferably immutably, in which case the above will suffice
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
