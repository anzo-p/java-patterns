package behavioral.strategy.strategies;

public class CannotFly implements FlyStrategy {

    public String fly() {
        return "cannot fly";
    }
}
