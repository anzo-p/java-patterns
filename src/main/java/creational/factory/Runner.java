package creational.factory;

import java.util.Scanner;

/*
    Factory
    - Create objects dynamically at runtime
    - Particularly notice that the exact class (type) to instantiate is defined by the factory from runtime data
    - Centralizes some object creation

    Adding another produce means
    - Extending another variation from the subclass
    - Adding necessary conditionals and code into the factory
 */

public class Runner {

    public static void doEnemyThing(EnemyShip enemy) {

        enemy.show();
        enemy.followHeroShip();
        enemy.shoot();
    }

    public static void main(String[] args) {

        EnemyShipFactory factory = new EnemyShipFactory();

        EnemyShip enemy = null;

        Scanner userChoice = new Scanner(System.in);

        System.out.println("Choose enemy type:\nR - Rocket\nU - UFO\nB - Big UFO (be careful)");

        if (userChoice.hasNextLine()) {
            enemy = factory.makeEnemyShip(userChoice.nextLine());
        }

        if (enemy != null) {
            doEnemyThing(enemy);
        } else {
            System.out.println("try again with an option from the list");
        }
    }
}
