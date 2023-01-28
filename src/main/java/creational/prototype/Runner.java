package creational.prototype;

/*
    Prototype
    - Instantiate a desired object (by cloning) on demand
    - Applies to any subclass for a superclass known to Client
    - 'Lazy'

    Adding a new prototype means
    - Adding a new implementation to an existing interface
    - Adding a new produce interface and new implementations to it
 */

public class Runner {

    public static void main(String[] args) {

        CloneFactory animalCloner = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clone = (Sheep) animalCloner.getClone(sally);

        System.out.println("Sally says: " + sally + "! and has instance number: " + System.identityHashCode(sally));

        System.out.println("Clone says the same: " + clone + "! because it is a clone of Sally, though has a different instance hash: " + System.identityHashCode(clone));
    }
}
