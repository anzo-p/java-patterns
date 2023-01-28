package creational.prototype;

public class CloneFactory {

    public Animal getClone(Animal sample) {
        return sample.makeCopy();
    }
}
