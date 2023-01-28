package behavioral.chainOfResponsibility;

public class Numbers {

    private int leftTerm;
    private int rightTerm;

    private String computation;

    public Numbers(int leftTerm, int rightTerm, String computation) {
        this.leftTerm = leftTerm;
        this.rightTerm = rightTerm;
        this.computation = computation;
    }

    public int getLeftTerm() { return leftTerm; }
    public int getRightTerm() { return rightTerm; }

    public String getComputation() { return computation; }
}
