package creational.builder;

public class RobotDirector {

    private final RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public RobotDirector setHead(String head) {
        robotBuilder.buildRobotHead(head);
        return this;
    }

    public RobotDirector setTorso(String torso) {
        robotBuilder.buildRobotTorso(torso);
        return this;
    }

    public RobotDirector setArms(String arms) {
        robotBuilder.buildRobotArms(arms);
        return this;
    }

    public RobotDirector setLegs(String legs) {
        robotBuilder.buildRobotLegs(legs);
        return this;
    }

    public Robot build() {
        return this.robotBuilder.getRobot();
    }
}
