package creational.abstractFactory;

/*
    the produce type doesn't have a constructor
    and doesn't know of any factory
    and wouldn't know, because constructors cannot be abstract
    and wouldn't be dynamically bound to implementing subclasses
 */
public abstract class EnemyShip {

    private String name;

    private EnemyShipEngine engine;
    private EnemyShipWeapon weapon;

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(EnemyShipEngine engine) {
        this.engine = engine;
    }

    public void setWeapon(EnemyShipWeapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public abstract void makeShip();

    public abstract void displayEnemyShip();

    public abstract void followHeroShip();

    public abstract void enemyShipShoots();

    public String toString() {
        return "The " + " has a top speed of " + engine + " and attack power of " + weapon;
    }
}
