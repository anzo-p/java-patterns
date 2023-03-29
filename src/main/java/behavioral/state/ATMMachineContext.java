package behavioral.state;

import behavioral.state.states.*;

public class ATMMachineContext {

    private final ATMState hasCard;
    private final ATMState noCard;
    private final ATMState hasCorrectPin;
    private final ATMState outOfCash;

    private ATMState state;

    private int cashBalance = 2000;

    private boolean correctPinEntered = false;

    public ATMMachineContext() {
        hasCard = new CardInsertedState(this);
        noCard = new CardEjectedState(this);
        hasCorrectPin = new CorrectPinInsertedState(this);
        outOfCash = new OutOfCashState(this);

        state = noCard;

        if (cashBalance < 0) {
            state = outOfCash;
        }
    }

    // This API should be private to states
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


    public void setState(ATMState state) {
        this.state = state;
    }

    public void setCorrectPin() { this.correctPinEntered = true; }

    public void setIncorrectPin() { this.correctPinEntered = false; }

    public int getCashBalance() { return this.cashBalance; }

    public void setCashIntoMachine(int insertedAmount) {
        this.cashBalance += insertedAmount;
    }

    // This API should be private to Consumer
    public void insertCard() {
        this.state.insertCard();
    }

    public void ejectCard() {
        this.state.ejectCard();
    }

    public void insertPin(String pinEntered) {
        this.state.insertPin(pinEntered);
    }

    public void requestCash(int amountToWithdraw) {
        this.state.requestCash(amountToWithdraw);
    }
}
