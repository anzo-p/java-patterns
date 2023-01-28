package behavioral.observer;

import behavioral.observer.observable.MarketInfoProducerAndPubSubCoordinator;
import behavioral.observer.observable.ProducerCoordinator;

import java.text.DecimalFormat;

// just some async playing for the fun of it as the app.observer.Observer Pattern often utilizes multi-threading
public class StockFetcher implements Runnable {

    private ProducerCoordinator stockPriceTracker;
    private int startTime;
    private String ticker;
    private Double quote;

    public StockFetcher(ProducerCoordinator stockTracker, int startTime, String ticker, double quotation) {
        this.startTime = startTime;
        this.ticker = ticker;
        this.quote = quotation;
        this.stockPriceTracker = stockTracker;

    }

    @Override
    public void run() {
        for (int i=1; i <= 20; i++) {
            try {
                Thread.sleep(startTime * 1000L);
            } catch(Exception ignored) { }

            double fluctuation = (Math.random() * (.63)) - .03;

            switch (ticker) {
                case "IBM" -> ((MarketInfoProducerAndPubSubCoordinator) stockPriceTracker).setIBMQuote(quote);
                case "Apple" -> ((MarketInfoProducerAndPubSubCoordinator) stockPriceTracker).setAaplQuote(quote);
                case "Google" -> ((MarketInfoProducerAndPubSubCoordinator) stockPriceTracker).setGoogQuote(quote);
                default -> System.out.println("oops we arent tracking such ticker " + ticker);
            }

            quote = Double.valueOf(String.valueOf(quote + fluctuation));

            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("");
            System.out.println(ticker + ": delta " + df.format(fluctuation) + " makes " + df.format(quote + fluctuation));
        }
    }
}
