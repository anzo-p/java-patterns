package creational.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    public void run() {
        SingletonScrabbleLetterDealer instance = SingletonScrabbleLetterDealer.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(instance) + " has letters " + instance.getLetterList() + " available");

        LinkedList<String> tiles = instance.getTiles(7);

        System.out.println("Got tiles: " + tiles);

        System.out.println("Available letters after deal: " + instance.getLetterList());
    }
}
