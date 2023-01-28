package structural.proxy.states;

import structural.proxy.ATMMachineContext;
import structural.proxy.ATMState;

public class OutOfCashState implements ATMState {

    ATMMachineContext atmMachine;

    public OutOfCashState(ATMMachineContext atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("System Error (Out of Cash) - don't insert card atm");
    }

    public void ejectCard() {
        System.out.println("System Error (Out of Cash) - also there is no card");
    }

    public void insertPin(String pinEntered) {
        System.out.println("System Error (Out of Cash) - don't select pin atm");
    }

    public void requestCash(int amountToWithdraw) {
        System.out.println("System Error (Out of Cash) - nothing to withdraw atm");
    }
}
