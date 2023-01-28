package creational.builder;

public class MrRobotBuilder implements RobotBuilder {

    private Robot robot;

    public MrRobotBuilder() {
        this.robot = new Robot();
    }

    public void buildRobotHead() {
        this.robot.setRobotHed("Fancy head");
    }

    public void buildRobotTorso() {
        this.robot.setTorso("Silly torso");
    }

    public void buildRobotArms() {
        this.robot.setArms("Shiny arms");
    }

    public void buildRobotLegs() {
        this.robot.setLegs("Steel legs");
    }

    public Robot getRobot() {
        return this.robot;
    }
}
