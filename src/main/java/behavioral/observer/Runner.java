package behavioral.observer;

/*
    Observer

    Key concepts
    - Is a Consumer to notifications / messages of a Producer
    - Asks to be registered for receiving those messages from that producer
    - Has a messaging hook that the producer then calls
    - Consumers take responsibility in registering to desired notifications and to handle their potential redundancy

    Key Objects
        Observer, Coordinator

    Adding an Observer
    - Add a new implementation to the observer
    - (Or a new implementation to the producer for that matter)

    In practice
        Strictly speaking the Observer pattern is the Consumer / Subscriber part of a Publish-and-Subscribe or Producer-Consumer pattern
        Most importantly there are Observers and Coordinators
        Observer knows of and register to the Coordinator
        Observer also contains a 'hook' to be called whenever the Coordinator needs to notify the Observer
        Observers do not poll for updates, they are notified by the Coordinator on demand
        Coordinators may further be split into Coordinator and Producer, where Producers also register to coordinators
        Minimally the Client knows of one observer which also might be passed to it by a Provider

    Similar to mediator pattern, but the focus is on updating all observers asap on a state change at the coordinator
 */

import behavioral.observer.observable.MarketInfoProducerAndPubSubCoordinator;
import behavioral.observer.observer.MarketInfoConsumer;

public class Runner {

    public static void main(String[] args) {

        MarketInfoProducerAndPubSubCoordinator stockPicker = new MarketInfoProducerAndPubSubCoordinator();

        MarketInfoConsumer bloomberg = new MarketInfoConsumer("Bloomberg", stockPicker);

        stockPicker.setIBMQuote(123.45);
        stockPicker.setAaplQuote(456.78);
        stockPicker.setGoogQuote(98.76);

        MarketInfoConsumer reuters = new MarketInfoConsumer("Reuters", stockPicker);

        stockPicker.setIBMQuote(122.21);
        stockPicker.setAaplQuote(457.99);
        stockPicker.setGoogQuote(99.12);

        stockPicker.unegister(bloomberg);

        Runnable addIbm = new StockFetcher(stockPicker, 2, "IBM", 123.45);
        Runnable addApple = new StockFetcher(stockPicker, 2, "Apple", 456.78);
        Runnable addGoogle = new StockFetcher(stockPicker, 2, "Google", 98.76);

        new Thread(addIbm).start();
        new Thread(addApple).start();
        new Thread(addGoogle).start();
    }
}
