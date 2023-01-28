package creational.abstractFactory.types.ufo;

import creational.abstractFactory.EnemyShip;
import creational.abstractFactory.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {

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
