package creational.prototype;

/*
    Prototype

    Key Concepts
    - Instantiate a desired object (by cloning) on demand
    - Applies to any subclass for a superclass known to Client
    - 'Lazy'

    Key Objects
    -

    Adding a Prototype
    - Add a new implementation to an existing interface
    - Add a new produce interface and new implementations to it

    In practice
        A language construct. Fork another immediately fully working instance in the throw without having to decide all details
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
