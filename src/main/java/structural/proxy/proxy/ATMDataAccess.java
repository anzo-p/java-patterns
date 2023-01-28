package structural.proxy.proxy;

import structural.proxy.ATMState;

public interface ATMDataAccess {

    ATMState refresh();

    int getCashInMachine();
}
