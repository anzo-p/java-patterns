package behavioral.observer.observable;

import behavioral.observer.observer.Observer;

import java.util.ArrayList;

public class MarketInfoProducerAndPubSubCoordinator implements ProducerCoordinator {

    private ArrayList<Observer> observers;

    private double ibmQuote;
    private double aaplQuote;
    private double googQuote;

    public MarketInfoProducerAndPubSubCoordinator(){
        observers = new ArrayList<>();
    }

    public void register(Observer o) {
        observers.add(o);

        System.out.println("app.observer.Observer " +  (observers.indexOf(o) + 1) + " was registered");
    }

    public void unegister(Observer o) {
        System.out.println("app.observer.Observer " +  (observers.indexOf(o) + 1) + " was removed");

        observers.remove(o);
    }

    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.updateHook(ibmQuote, aaplQuote, googQuote);
        }
    }

    public void setIBMQuote(double quote) {
        this.ibmQuote = quote;
        notifyObserver();
    };

    public void setAaplQuote(double quote) {
        this.aaplQuote = quote;
        notifyObserver();
    };

    public void setGoogQuote(double quote) {
        this.googQuote = quote;
        notifyObserver();
    };
}
