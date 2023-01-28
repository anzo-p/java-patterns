package creational.factory;

public class EnemyShip {

    private String name;
    private Double dps;

    public void setName(String name) {
        this.name = name;
    }

    public void setDps(Double dps) {
        this.dps = dps;
    }

    public String getName() {
        return name;
    }

    public Double getDps() {
        return dps;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is stalking hero and participating in full room aggro");
    }

    public void show() {
        System.out.println(getName() + " is at position x, y");
    }

    public void shoot() {
        System.out.println(getName() + " says pew pew with " + getDps() + " dps");
    }
}
