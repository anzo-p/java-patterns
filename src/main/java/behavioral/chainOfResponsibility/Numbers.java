package behavioral.chainOfResponsibility;

public class Numbers {

    private final int leftTerm;
    private final int rightTerm;

    private final String computation;

    public Numbers(int leftTerm, int rightTerm, String computation) {
        this.leftTerm = leftTerm;
        this.rightTerm = rightTerm;
        this.computation = computation;
    }

    public int getLeftTerm() { return leftTerm; }
    public int getRightTerm() { return rightTerm; }

    public String getComputation() { return computation; }
}
