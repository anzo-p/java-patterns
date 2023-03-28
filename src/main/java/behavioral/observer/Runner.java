package behavioral.observer;

/*
    app.observer.Observer
    - Is a Consumer to notifications / messages of a Producer
    - Asks to be registered for receiving those messages from that producer
    - Has a messaging hook that the producer then calls
    - Consumers take responsibility in registering to desired notifications and to handle their potential redundancy

    Topping up the pattern means
    - Adding a new implementation to the observer
    - (Or a new implementation to the producer for that matter)

    In this example the producer is also a message broker coordinator.
    These could be separate entities, but that is irrelevant from the perspective of the pattern
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
