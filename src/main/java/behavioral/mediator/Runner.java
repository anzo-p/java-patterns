package behavioral.mediator;

/*
    Mediator
    - Handle communication between objects, now called 'Colleagues'
    - Defines a contract interface through which colleagues may send messages to 'whomever it may concern'
    - Colleagues do not know each others

    Adding a colleague means
    - Extending from Colleague class
    - Registering to mediator - in this example via the colleagues' constructors
 */

import behavioral.mediator.mediator.StockMediator;
import behavioral.mediator.mediator.colleagues.GormanSlacks;
import behavioral.mediator.mediator.colleagues.JTPoorman;
import behavioral.mediator.mediator.colleagues.PityChorp;

public class Runner {

    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        GormanSlacks gormanSlacks = new GormanSlacks(nyse);

        JTPoorman jtPoorman = new JTPoorman(nyse);

        PityChorp pityChorp = new PityChorp(nyse);

        gormanSlacks.buyOffer("AAPL", 75);
        gormanSlacks.buyOffer("AAPL", 66);
        gormanSlacks.sellOffer("MSFT", 66);

        jtPoorman.sellOffer("MSFT", 100);
        jtPoorman.sellOffer("GOOG", 55);
        jtPoorman.sellOffer("AAPL", 66);
        jtPoorman.sellOffer("AAPL", 39);

        pityChorp.buyOffer("GOOG", 66);
        pityChorp.buyOffer("GOOG", 41);
        pityChorp.buyOffer("GOOG", 55);
        pityChorp.sellOffer("MSFT", 75);

        nyse.showOfferings();
    }
}
