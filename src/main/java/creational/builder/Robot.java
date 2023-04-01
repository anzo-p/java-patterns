package creational.builder;

public class Robot implements RobotBlueprint {

    private String head;
    private String torso;
    private String arms;
    private String legs;

    public void setRobotHed(String head) {
        this.head = head;
    }

    public void setTorso(String torso) {
        this.torso = torso;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getHead() {
        return head;
    }

    public String getTorso() {
        return torso;
    }

    public String getArms() {
        return arms;
    }

    public String getLegs() {
        return legs;
    }
}
