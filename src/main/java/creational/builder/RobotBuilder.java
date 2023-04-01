package creational.builder;

public interface RobotBuilder {

    void buildRobotHead(String head);

    void buildRobotTorso(String torso);

    void buildRobotArms(String arms);

    void buildRobotLegs(String legs);

    Robot getRobot();
}
