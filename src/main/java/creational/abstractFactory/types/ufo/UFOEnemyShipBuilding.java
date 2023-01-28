package creational.abstractFactory.types.ufo;

import creational.abstractFactory.EnemyShip;
import creational.abstractFactory.EnemyShipFactory;
import creational.abstractFactory.EnemyShipBuilding;

import java.util.Locale;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String shipType) {
        EnemyShip theEnemyShip = null;

        switch (shipType.toUpperCase(Locale.ROOT)) {
            case "UFO":
                EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
                theEnemyShip = new UFOEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Grunt ship");
                break;

            /*
            case "UFO BOSS":
                app.EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss ship");
                break;
             */

            default:
                System.out.println(shipType + " does not correspond to a known ship blueprint");
        }

        return theEnemyShip;
    }
}
