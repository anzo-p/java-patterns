package creational.factory;

import java.util.Locale;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        String upperNewShipType = newShipType.toUpperCase(Locale.ROOT);

        switch (upperNewShipType) {
            case "R":
                return new RocketEnemyShip();

            case "U":
                return new UfoEnemyShip();

            case "B":
                return new BigUfoEnemyShip();

            default:
                System.out.println("'" + newShipType + "' is not a valid option");
                return null;
        }

    }
}
