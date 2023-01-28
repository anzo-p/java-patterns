package structural.facade.bank;

import java.util.Objects;

public class SecurityCodeCheck {

    private String securityCode = "1234";

    public String getSecurityCode() { return this.securityCode; }

    public boolean isCodeCorrect(String securityCode) {
        return Objects.equals(this.securityCode, securityCode);
    }
}
