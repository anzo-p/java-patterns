package structural.adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    public void fireWeapon() {
        enemyRobot.killShit();
    }

    public void driveForward() {
        enemyRobot.walk();
    }

    public void assignDriver(String driverName) {
        enemyRobot.reactToDriver(driverName);
    }
}
