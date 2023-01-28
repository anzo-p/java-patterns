package structural.proxy.states;

import structural.proxy.ATMMachineContext;
import structural.proxy.ATMState;

public class HasNoCardState implements ATMState {

    ATMMachineContext atmMachine;

    public HasNoCardState(ATMMachineContext atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("Card inserted, please enter PIN _");

        atmMachine.setState(atmMachine.getHasCardState());
    }

    public void ejectCard() {
        System.out.println("There is no card to eject");
    }

    public void insertPin(String pinEntered) {
        System.out.println("Card required before PIN");
    }

    public void requestCash(int amountToWithdraw) {
        System.out.println("Card required before withdrawal");
    }
}
