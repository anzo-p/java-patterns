package structural.proxy.proxy;

/*
    This Proxy class is the only necessary thing
    It composes-in a target class and exposes a limited api to it

    The interface that this implements is NOT absolutely required, but it is more like a curiosity that enforces
    - To indicate the intention via a common mixin between proxy and target classes
    - Similar naming to the limited api in proxy and target classes
 */

import structural.proxy.ATMMachineContext;
import structural.proxy.ATMState;

public class ATMProxy implements ATMDataAccess {

    private ATMMachineContext atm;

    public ATMProxy() {
        this.atm = new ATMMachineContext();
    }

    public ATMState refresh() {
        return atm.refresh();
    }

    public int getCashInMachine() {
        return atm.getCashInMachine();
    }
}
