package creational.singleton;/*
    A Singleton is a single same instance of multiple calls to obtain an instance of a class
    - Over many calls
    - Over many threads
    - Thus having the same state
 */

public class RunnerWithThreads {

    public static void main(String[] args) {

        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();

        new Thread(getTilesAgain).start();
    }
}
