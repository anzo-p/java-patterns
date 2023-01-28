package creational.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("A Sheep was made");
    }

    public Animal makeCopy() {
        System.out.println("A Sheep is being cloned");

        Sheep sheepObject;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return sheepObject;
    }

    public String toString() {
        return "Baaaaaah";
    }
}
