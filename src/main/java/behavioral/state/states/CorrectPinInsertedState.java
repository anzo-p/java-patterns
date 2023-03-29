package behavioral.state.states;

import behavioral.state.ATMMachineContext;

public class CorrectPinInsertedState implements ATMState {

    ATMMachineContext atmMachine;

    public CorrectPinInsertedState(ATMMachineContext atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void insertCard() {
        System.out.println("Already has one card");
    }

    public void ejectCard() {
        System.out.println("Card ejected");

        atmMachine.setState(atmMachine.getHasNoCardState());
    }

    public void insertPin(String pinEntered) {
        System.out.println("Already successful PIN authorization");
    }

    public void requestCash(int amountToWithdraw) {
        if (atmMachine.getCashBalance() < amountToWithdraw) {
            System.out.println("Sorry bro, not enough cash for that, try requesting for a smaller sum");
        } else {
            System.out.println("Here is the money and the card, ttyl mate");

            atmMachine.setCashIntoMachine(amountToWithdraw * -1);

            atmMachine.setState(atmMachine.getHasNoCardState());

            if (atmMachine.getCashBalance() <= 0) {
                atmMachine.setState(atmMachine.getOutOfCashState());
            }
        }
    }
}
