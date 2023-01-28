package others.mvc;

public class Model {

    private int calculationValue;

    public void addTwoNumbers(int a, int b) {
        this.calculationValue = a + b;
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}
