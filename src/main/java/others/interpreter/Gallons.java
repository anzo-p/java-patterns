package others.interpreter;

public class Gallons extends Expression {

    public String gallons(Double quantity) {
        return Double.toString(quantity);
    }

    public String quarts(Double quantity) {
        return Double.toString(quantity * 4);
    }

    public String pints(Double quantity) {
        return Double.toString(quantity * 8);
    }

    public String cups(Double quantity) {
        return Double.toString(quantity * 16);
    }

    public String spoons(Double quantity) {
        return Double.toString(quantity * 256);
    }
}
