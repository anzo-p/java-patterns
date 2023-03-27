package creational.singleton;

import java.util.*;

public class SingletonScrabbleLetterDealer {

    private static SingletonScrabbleLetterDealer theOnlyInstance = null;

    static boolean firstThread = true;

    private final String[] scrabbleLetters = {
            "a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b",
            "c", "c",
            "d", "d", "d", "d",
            "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e",
            "f", "f",
            "g", "g", "g",
            "h", "h",
            "i", "i", "i", "i", "i", "i", "i", "i", "i",
            "j",
            "k",
            "l", "l", "l", "l",
            "m", "m",
            "n", "n", "n", "n", "n", "n",
            "o", "o", "o", "o", "o", "o", "o", "o",
            "p", "p",
            "q",
            "r", "r", "r", "r", "r", "r",
            "s", "s", "s", "s",
            "t", "t", "t", "t", "t", "t",
            "u", "u", "u", "u",
            "v", "v",
            "w", "w",
            "x",
            "y", "y",
            "z"
    };

    private final LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private SingletonScrabbleLetterDealer() {}

    public static SingletonScrabbleLetterDealer getInstance() {
        if (theOnlyInstance == null) {

            synchronized (SingletonScrabbleLetterDealer.class) {
                if (firstThread) {
                    firstThread = false;

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    theOnlyInstance = new SingletonScrabbleLetterDealer();

                    Collections.shuffle(theOnlyInstance.letterList);
                }
            }
        }

        return theOnlyInstance;
    }

    public LinkedList<String> getLetterList() {

        return theOnlyInstance.letterList;
    }

    public LinkedList<String> getTiles(int desiredTilesCount) {
        LinkedList<String> tilesToSend = new LinkedList<>();

        for (int i=0; i <= desiredTilesCount; i++) {
            tilesToSend.add(theOnlyInstance.letterList.remove(0));
        }

        return tilesToSend;
    }
}
