package creational.abstractFactory;

import creational.abstractFactory.types.ufo.UFOEnemyShipBuilding;

/*
    Abstract Factory
    - Like a Factory but everything is abstracted out
    - Create families of related objects without specifying concrete class
    - Select many objects out of many options at runtime
    - Designers of those parts may develop them independent of those who develop factory code
    - Eventually less complex than plain factory as the variations to build increase substantially

    Adding another produce means
    - Add new variation to part
    - Add new type variation and to it add new parts or reuse from other types
    - Add new type 'category' and to it variations and parts or reuse from other types
    - and so on...
 */

public class Runner {

    public static void main(String[] args) {

        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");

        //app.EnemyShip theBoss = MakeUFOs.makeEnemyShip("UFO BOSS");
    }
}


/*
    abstract class
    - fields may be unset (tho should not) but cannot be abstract
    - at least one and up to every method may be abstract
    - abstract keyword is required for methods that have no body
    - abstract methods may be protected, or else are public

    vs. interface
    - entire class is fully abstract
    - all members are public as visibility modifiers are not allowed
    - fields may be initialized, which also makes them static
    - methods must not have bodies
 */
