package behavioral.templateMethod;

/*
    Template Method
    - An Abstract class contains a method that will be executed
    - This method will launch a series of other methods
    - One or more of those methods are left to the Concrete classes to implement or override

    Topping up a template method means
    - Extending another produce variation
 */

public class Runner {

    public static void main(String[] args) {

        Hoagie customer = new ItalianHoagie();

        customer.makeSandwichTemplateMethod();

        Hoagie anotherCustomer = new VeggieHoagie();

        anotherCustomer.makeSandwichTemplateMethod();
    }
}
