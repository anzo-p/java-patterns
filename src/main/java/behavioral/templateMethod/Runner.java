package behavioral.templateMethod;

/*
    Template Method

    Key concepts
    - An Abstract class contains a method that will be executed
    - This method will launch a series of other methods
    - One or more of those methods are left to the Concrete classes to implement or override

    Key Objects
    - Abstract Class for the template method, Implementations

    Adding an implementation
    - Extend another produce variation

    In practice
        A Template Method moves general parts of an algorithm to a superclass
        This makes the algorithm more manageable and also more extensible
 */

public class Runner {

    public static void main(String[] args) {

        Hoagie customer = new ItalianHoagie();

        customer.makeSandwichTemplateMethod();

        Hoagie anotherCustomer = new VeggieHoagie();

        anotherCustomer.makeSandwichTemplateMethod();
    }
}
