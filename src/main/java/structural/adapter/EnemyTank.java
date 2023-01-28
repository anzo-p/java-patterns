package structural.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random randomGenerator = new Random();

    public void fireWeapon() {
        int dps = randomGenerator.nextInt(80) + 20;

        System.out.println("Enemy Tank does " + dps + " dps");
    }

    public void driveForward() {
        int movement = randomGenerator.nextInt(160) + 60;

        System.out.println("Enemy Tank moves " + movement + " m/s");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the Enemy Tank");
    }
}
