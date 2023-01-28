package structural.facade.bank;

public class FundsCheck {

    private double balance = 300.0;


    private void withdraw(Double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;

        System.out.println("New balance after deposit of € " + amount + " is " + this.balance);
    }

    public void checkThenWithdraw(Double amount) {
        if (this.balance > amount) {
            withdraw(amount);
        } else {
            System.out.println("Not enough balance (" + this.balance + ") to pull out " + amount);
        }
    }
}
