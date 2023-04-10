package behavioral.mediator;

/*
    Mediator

    Key concepts
    - Handle communication between objects, now called 'Colleagues'
    - Defines a contract interface through which colleagues may send messages to 'whomever it may concern'
    - Colleagues do not know each others

    Key Objects
        Colleague, Mediator

    Adding a Colleague
    - Extend from Colleague class
    - Register to mediator - in this example via the colleagues' constructors

    In practice
        Colleagues are objects that wish to emit messages to other colleagues without knowing anything about those other colleagues
        Instead of calling those other colleagues directly, they know of, register to, and emit messages to a Mediator
        The Mediator then contains the logic that the colleagues wish to do with other colleagues
        Mediator knows of all the registered colleagues and calls them sequentially
        Minimally the Client knows of one colleague which also might be passed to it by a Provider

    Similar to observer pattern, but the focus is on moving all the logic of interactions between colleagues to the mediator
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
