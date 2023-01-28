package structural.facade;

/*
    Facade
    - Client calls one endpoint behind which a lot of things happen
    - Quite exactly like a request-response interface
    - A lot of different things happens inside one call route
    - Client doesn't know much anything about all that and doesn't want to
 */

public class Runner {

    public static void main(String[] args) {

        BankAccountFacade bankApi = new BankAccountFacade("12345678", "1234");

        bankApi.withdrawCash(30.0);

        bankApi.withdrawCash(333.33);

        bankApi.depositCash(150.0);

        bankApi.withdrawCash(333.33);

        BankAccountFacade bankApi2 = new BankAccountFacade("12345678", "2345");

        bankApi2.withdrawCash(30.0);

        bankApi2.depositCash(150.0);
    }
}
