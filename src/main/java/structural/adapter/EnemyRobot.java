package structural.adapter;

import java.util.Random;

public class EnemyRobot {

    Random randomGenerator = new Random();

    void killShit() {
        int dps = randomGenerator.nextInt(80) + 20;

        System.out.println("Enemy Robot does " + dps + " dps");
    }

    void walk() {
        int movement = randomGenerator.nextInt(10) + 1;

        System.out.println("Enemy Robot walks " + movement + " meters");
    }

    void reactToDriver(String controller) {
        System.out.println(controller + " attempts control on Enemy Robot but this AI powered thing can move around on its own");
    }
}
