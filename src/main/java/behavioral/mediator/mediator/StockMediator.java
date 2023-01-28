package behavioral.mediator.mediator;

import behavioral.mediator.models.StockOffer;

import java.util.ArrayList;
import java.util.Objects;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> buyOffers;
    private ArrayList<StockOffer> sellOffers;

    public StockMediator() {
        colleagues = new ArrayList<>();
        buyOffers = new ArrayList<>();
        sellOffers = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void buyOffer(String ticker, int shares, String colleagueCode) {
        boolean stockSold = false;

        for (StockOffer buyOffer : buyOffers) {

            if ((Objects.equals(buyOffer.getTicker(), ticker)) && (buyOffer.getShares() == shares)) {

                buyOffers.remove(buyOffer);
                stockSold = true;

                System.out.println(shares + " shares of " + ticker + " sold to " + buyOffer.getColleagueCode());
            }

            if (stockSold) {
                break;
            }
        }

        if (!stockSold) {
            System.out.println(shares + " shares of " + ticker + " added to internal lot");

            StockOffer offer = new StockOffer(ticker, shares, colleagueCode);

            sellOffers.add(offer);
        }
    }

    public void sellOffer(String ticker, int shares, String colleagueCode) {
        boolean stockBought = false;

        for (StockOffer sellOffer : sellOffers) {

            if ((Objects.equals(sellOffer.getTicker(), ticker)) && (sellOffer.getShares() == shares)) {

                sellOffers.remove(sellOffer);
                stockBought = true;

                System.out.println(shares + " shares of " + ticker + " bought by " + sellOffer.getColleagueCode());
            }

            if (stockBought) {
                break;
            }
        }

        if (!stockBought) {
            System.out.println(shares + " shares of " + ticker + " added to internal lot");

            StockOffer offer = new StockOffer(ticker, shares, colleagueCode);

            buyOffers.add(offer);
        }
    }

    public void showOfferings() {
        System.out.println("\nStocks for sale");

        for (StockOffer offer : sellOffers) {

            System.out.println(offer.getShares() + " of " + offer.getTicker());
        }

        System.out.println("\nStocks to buy");

        for (StockOffer offer : buyOffers) {

            System.out.println(offer.getShares() + " of " + offer.getTicker());
        }
    }
}
