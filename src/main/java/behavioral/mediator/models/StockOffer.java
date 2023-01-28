package behavioral.mediator.models;

public class StockOffer {

    private int shares;

    private String ticker;

    private String colleagueCode;

    public StockOffer(String ticker, int shares, String colleagueCode) {
        this.shares = shares;
        this.ticker = ticker;
        this.colleagueCode = colleagueCode;
    }

    public int getShares() {
        return shares;
    }

    public String getTicker() {
        return ticker;
    }

    public String getColleagueCode() {
        return colleagueCode;
    }
}
