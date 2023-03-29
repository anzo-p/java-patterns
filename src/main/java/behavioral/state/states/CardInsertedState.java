package behavioral.state.states;

import behavioral.state.ATMMachineContext;

import java.util.Objects;

public class CardInsertedState implements ATMState {

    ATMMachineContext atmMachine;

    public CardInsertedState(ATMMachineContext atmMachine) { // this is the sender / replyTo of Akka
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
        if (Objects.equals(pinEntered, "1234")) {
            System.out.println("Pin is correct");

            atmMachine.setCorrectPin();

            atmMachine.setState(atmMachine.getHasCorrectPinState());
        } else {
            System.out.println("Pin is incorrect");

            atmMachine.setIncorrectPin();

            System.out.println("Card also ejected");

            atmMachine.setState(atmMachine.getHasNoCardState());
        }
    }

    public void requestCash(int amountToWithdraw) {
        System.out.println("Pin required before requesting cash");
    }
}
