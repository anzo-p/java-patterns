package others.reflection;

public class UFOEnemyShip extends EnemyShip {

    private String idCode = "1234567";

    private String getPrivate() { return "how did you discover this?"; }

    private String getMorePrivate(int k, String s) {
        return "how did you get access to this: " + k + " and that: " + s + "?";
    }

    public UFOEnemyShip(int k, String s) {

        System.out.println("UFOEnemyShip was created with args: " + k + " and " + s);
    }

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    public void makeShip() {
        System.out.println("Making enemy ship " + getName());

        setEngine(shipFactory.addEnemyShipEngine());
        setWeapon(shipFactory.addEnemyShipWeapon());
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " flies - woosh woosh!");
    }

    public void followHeroShip() {
        System.out.println(getName() + " tracks hero - blip blip!");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " shoots bzzzz zzzap!");
    }
}
