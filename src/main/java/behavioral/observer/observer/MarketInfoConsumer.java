package behavioral.observer.observer;

import behavioral.observer.observable.ProducerCoordinator;

public class MarketInfoConsumer implements Observer {

    private final String name;

    private double ibmQuote;
    private double aaplQuote;
    private double googQuote;

    private static int observerIDTracker = 0;

    private final int observerID;

    public MarketInfoConsumer(String name, ProducerCoordinator stockPicker) {
        this.name = name;
        this.observerID = ++observerIDTracker;

        System.out.println("New observer '" + this.name + "' added: " + this.observerID);

        stockPicker.register(this);
    }

    public void updateHook(double ibmQuote, double aaplQuote, double googQuote) {
        this.ibmQuote = ibmQuote;
        this.aaplQuote = aaplQuote;
        this.googQuote = googQuote;

        showPrices();
    }

    public void showPrices() {
        System.out.println("\n" + name + " prices" + "\nIBM: " + ibmQuote + "\nApple: " + aaplQuote + "\nGoogle: " + googQuote);
    }
}
