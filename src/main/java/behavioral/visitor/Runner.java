package behavioral.visitor;

/*
    Visitor
    - Add methods to classes (or objects) without altering those classes much

    Visitor, Visitable, Accept, Visit

    Adding to Visitor means
    - Implementing a new Visitable and adding it to a Visitor
    - Implementing a new Visitor with methods that takes desired Visitable as argument
 */

import behavioral.visitor.visitables.HiTechGear;
import behavioral.visitor.visitables.Necessity;
import behavioral.visitor.visitables.Liquor;
import behavioral.visitor.visitors.TaxHolidayVisitor;
import behavioral.visitor.visitors.TaxVisitor;

public class Runner {

    public static void main(String[] args) {

        TaxVisitor regularTaxCalculation = new TaxVisitor();

        TaxHolidayVisitor holidayTaxCalculation = new TaxHolidayVisitor();

        Liquor pastis = new Liquor(19.21);
        Liquor irishCream = new Liquor(17.71);

        Necessity milk = new Necessity(0.96);
        Necessity cheese = new Necessity(8.72);

        HiTechGear xyz = new HiTechGear(1234.56);

        System.out.println(pastis.accept(regularTaxCalculation) + "\n");
        System.out.println(irishCream.accept(regularTaxCalculation) + "\n");
        System.out.println(milk.accept(regularTaxCalculation) + "\n");
        System.out.println(cheese.accept(regularTaxCalculation) + "\n");
        System.out.println(xyz.accept(regularTaxCalculation) + "\n");

        System.out.println(pastis.accept(holidayTaxCalculation) + "\n");
        System.out.println(irishCream.accept(holidayTaxCalculation) + "\n");
        System.out.println(milk.accept(holidayTaxCalculation) + "\n");
        System.out.println(cheese.accept(holidayTaxCalculation) + "\n");
        System.out.println(xyz.accept(holidayTaxCalculation) + "\n");
    }
}