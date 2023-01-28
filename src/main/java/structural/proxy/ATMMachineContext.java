package structural.proxy;

import structural.proxy.proxy.ATMDataAccess;
import structural.proxy.states.HasCardState;
import structural.proxy.states.HasCorrectPinState;
import structural.proxy.states.HasNoCardState;
import structural.proxy.states.OutOfCashState;

public class ATMMachineContext implements ATMDataAccess {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState outOfCash;

    private ATMState state;

    private int cashBalance = 2000;

    private boolean correctPinEntered = false;

    public ATMMachineContext() {
        hasCard = new HasCardState(this);
        noCard = new HasNoCardState(this);
        hasCorrectPin = new HasCorrectPinState(this);
        outOfCash = new OutOfCashState(this);

        state = noCard;

        if (cashBalance < 0) {
            state = outOfCash;
        }
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getHasNoCardState() {
        return noCard;
    }

    public ATMState getHasCorrectPinState() {
        return hasCorrectPin;
    }

    public ATMState getOutOfCashState() {
        return outOfCash;
    }

    public void setCorrectPin() { this.correctPinEntered = true; }

    public void setIncorrectPin() { this.correctPinEntered = false; }

    public int getCashInMachine() { return this.cashBalance; }

    public void setCashIntoMachine(int insertedAmount) {
        this.cashBalance += insertedAmount;
    }

    public ATMState refresh() {
        return this.state;
    }
}
