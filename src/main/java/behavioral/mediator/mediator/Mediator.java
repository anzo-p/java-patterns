package behavioral.mediator.mediator;

public interface Mediator {

    void addColleague(Colleague colleague);

    void buyOffer(String ticker, int shares, String colleagueCode);

    void sellOffer(String ticker, int shares, String colleagueCode);
}
