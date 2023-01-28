package behavioral.strategy.models;

import behavioral.strategy.strategies.CanFly;

public class Bird extends Animal {

    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new CanFly();
    }
}
