package behavioral.state.states;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(String pinEntered);

    void requestCash(int amountToWithdraw);
}
