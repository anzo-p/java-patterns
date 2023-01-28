package structural.facade;

import structural.facade.bank.AccountNumberCheck;
import structural.facade.bank.Bank;
import structural.facade.bank.FundsCheck;
import structural.facade.bank.SecurityCodeCheck;

public class BankAccountFacade {

    private String accountNumber;

    private String securityCode;

    Bank bank;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    public BankAccountFacade(String accountNumber, String securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        this.accountNumberCheck = new AccountNumberCheck();
        this.securityCodeCheck = new SecurityCodeCheck();
        this.fundsCheck = new FundsCheck();

        this.bank = new Bank();
    }

    public void withdrawCash(Double amount) {
        if (accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode)) {
            fundsCheck.checkThenWithdraw(amount);
        } else {
            System.out.println("Account number or security code doesn't match bank records");
        }
    }

    public void depositCash(Double amount) {
        if (accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode)) {
            fundsCheck.deposit(amount);
        } else {
            System.out.println("Account number or security code doesn't match bank records");
        }
    }
}
