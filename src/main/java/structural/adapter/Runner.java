package structural.adapter;

/*
    Adapter
    - Plug two incompatible interfaces together
    - When Client expects to call an interface (sometimes called Target Interface)

    Adding another adapter just plugs some other two interfaces
 */

public class Runner {

    public static void main(String[] args) {

        EnemyAttacker enemyTank = new EnemyTank();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);

        enemyTank.fireWeapon();
        enemyRobot.killShit();
        enemyRobotAdapter.fireWeapon();

        enemyTank.driveForward();
        enemyRobotAdapter.driveForward();

        enemyTank.assignDriver("bob the brave");
        enemyRobotAdapter.assignDriver("bob the brave");
    }
}
