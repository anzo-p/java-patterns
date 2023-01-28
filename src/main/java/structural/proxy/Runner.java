package structural.proxy;

/*
    Proxy
    - Limits access to another class
 */

import structural.proxy.proxy.ATMDataAccess;
import structural.proxy.proxy.ATMProxy;

public class Runner {

    public static void main(String[] args) {

        ATMDataAccess atmProxy = new ATMProxy();

        atmProxy.refresh().ejectCard();

        System.out.println("");

        atmProxy.refresh().insertPin("0000");

        atmProxy.refresh().requestCash(1000);

        System.out.println("");

        atmProxy.refresh().insertCard();

        atmProxy.refresh().insertCard();

        atmProxy.refresh().requestCash(1000);

        atmProxy.refresh().insertPin("0000");

        atmProxy.refresh().requestCash(1000);

        System.out.println("");

        atmProxy.refresh().insertCard();

        atmProxy.refresh().insertPin("1234");

        atmProxy.refresh().insertPin("0000");

        atmProxy.refresh().insertPin("1234");

        atmProxy.refresh().requestCash(3000);

        atmProxy.refresh().requestCash(2001);

        atmProxy.refresh().requestCash(2000);

        atmProxy.refresh().ejectCard();

        System.out.println("");

        atmProxy.refresh().insertCard();

        atmProxy.refresh().insertPin("1234");

        atmProxy.refresh().requestCash(1);
    }
}
