package creational.builder;

/*
    Builder
    - Build a compositional object at runtime
    - Logic to instantiate parts are independent of each others and the logic to instantiate main object
    - The builder class is the only one who knows how to build the produce

    Adding a new produce means
    - Adding a new produce variation to implement an existing blueprint
    - Or adding an entire new blueprint, new produce variation to implement it, and new director to build it
    - Either way requires a new builder class as well

    Up front this seems like the hardest pattern to maintain as the produces increase
 */

public class Runner {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new MrRobotBuilder();

        RobotDirector robotDirector = new RobotDirector(robotBuilder);

        Robot robot = robotDirector
                .setHead("funny")
                .setTorso("fancy")
                .setArms("handy")
                .setLegs("shiny")
                .build();

        System.out.println("Robot built with head: " + robot.getHead() + " and torso: " + robot.getTorso() +
                " and arms: " + robot.getArms() + " and legs: " + robot.getLegs());
    }
}
