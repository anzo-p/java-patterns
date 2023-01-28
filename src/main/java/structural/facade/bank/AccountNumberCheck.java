package structural.facade.bank;

import java.util.Objects;

public class AccountNumberCheck {

    private String accountNumber = "12345678";

    public String getAccountNumber() { return this.accountNumber; }

    public boolean accountActive(String accountNumber) {
        return Objects.equals(this.accountNumber, accountNumber);
    }
}
