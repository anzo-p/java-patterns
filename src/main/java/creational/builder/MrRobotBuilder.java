package creational.builder;

public class MrRobotBuilder implements RobotBuilder {

    private final Robot robot;

    public MrRobotBuilder() {
        this.robot = new Robot();
    }

    public void buildRobotHead(String headType) {
        this.robot.setRobotHed(headType + " head");
    }

    public void buildRobotTorso(String torsoType) {
        this.robot.setTorso(torsoType + " torso");
    }

    public void buildRobotArms(String armsType) {
        this.robot.setArms(armsType + " arms");
    }

    public void buildRobotLegs(String legsType) {
        this.robot.setLegs(legsType + " legs");
    }

    public Robot getRobot() {
        return this.robot;
    }
}
