package behavioral.strategy.models;

import behavioral.strategy.strategies.CannotFly;

public class Dog extends Animal{

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CannotFly();
    }

    public void digHole(){
        System.out.println("Dug a hole");
    }
}
