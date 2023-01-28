package behavioral.mediator.mediator;

import java.util.UUID;

public abstract class Colleague {

    private Mediator mediator;

    private String colleagueCode;

    public Colleague(Mediator mediator, String colleague) {
        String colleagueCode = colleague + "-" + UUID.randomUUID();

        this.mediator = mediator;
        this.colleagueCode = colleagueCode;

        mediator.addColleague(this);

        System.out.println(colleague + " signed up\n");
    }

    public void buyOffer(String ticker, int shares) {
        mediator.buyOffer(ticker, shares, this.colleagueCode);
    }

    public void sellOffer(String ticker, int shares) {
        mediator.sellOffer(ticker, shares, this.colleagueCode);
    }
}
