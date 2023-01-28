package creational.abstractFactory.types.ufo;

import creational.abstractFactory.EnemyShipFactory;
import creational.abstractFactory.EnemyShipWeapon;
import creational.abstractFactory.EnemyShipEngine;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    public EnemyShipEngine addEnemyShipEngine() {
        return new UFOEnemyShipEngine();
    }

    public EnemyShipWeapon addEnemyShipWeapon() {
        return new UFOEnemyShipWeapon();
    }
}
