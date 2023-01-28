package others.interpreter;

public class ConversionContext {

    private String conversionResponse;

    private String fromConversion;

    private String toConversion;

    private Double quantity;

    private String[] questionParts;

    public ConversionContext(String input) {
        this.questionParts = input.split(" ");

        this.fromConversion = getCapitalize(questionParts[1]);
        this.toConversion = getLowercase(questionParts[3]);
        this.quantity = Double.valueOf(questionParts[0]);

        this.conversionResponse = questionParts[0] + " " + questionParts[1] + " equals ";
    }

    public String getFromConversion() {
        return this.fromConversion;
    }

    public String getToConversion() {
        return this.toConversion;
    }

    public String getConversionResponse() {
        return this.conversionResponse;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    private String getLowercase(String s) {
        return s.toLowerCase();
    }

    private String getCapitalize(String s) {
        s.toLowerCase();

        s = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        return s;
    }
}
