package creational.singleton;

import java.util.LinkedList;

public class Runner {

    public static void main(String[] args) {

        SingletonScrabbleLetterDealer firstDealerInstance = SingletonScrabbleLetterDealer.getInstance();

        System.out.println("Instance 1 ID: " + System.identityHashCode(firstDealerInstance) + " has letters " + firstDealerInstance.getLetterList() + " available");

        LinkedList<String> playerOneTiles = firstDealerInstance.getTiles(7);

        System.out.println("Player 1 letters: " + playerOneTiles);

        System.out.println("Available letters after init deal to player one: " + firstDealerInstance.getLetterList());

        SingletonScrabbleLetterDealer secondDealerInstance = SingletonScrabbleLetterDealer.getInstance();

        System.out.println("Instance 2 ID: " + System.identityHashCode(secondDealerInstance) + " has letters " + secondDealerInstance.getLetterList() + " available");

        LinkedList<String> playerTwoTiles = secondDealerInstance.getTiles(7);

        System.out.println("Player 2 letters: " + playerTwoTiles);

        System.out.println("Available letters after init deal to player two: " + secondDealerInstance.getLetterList());
    }
}
