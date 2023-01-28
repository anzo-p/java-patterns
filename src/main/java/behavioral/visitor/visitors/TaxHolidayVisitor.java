package behavioral.visitor.visitors;

import behavioral.visitor.Visitor;
import behavioral.visitor.visitables.HiTechGear;
import behavioral.visitor.visitables.Liquor;
import behavioral.visitor.visitables.Necessity;

public class TaxHolidayVisitor implements Visitor {

    public TaxHolidayVisitor() { }

    public Double visit(Liquor item) {
        System.out.println("Liquor item - price with holiday Tax (10%)");

        return item.getPrice() * 0.10 + item.getPrice();
    }

    public Double visit(Necessity item) {
        System.out.println("Necessity item - price with holiday Tax (7%)");

        return item.getPrice() * 0.07 + item.getPrice();
    }

    public Double visit(HiTechGear item) {
        System.out.println("HiTechGear item - price with holiday Tax (21%)");

        return item.getPrice() * 0.21 + item.getPrice();
    }
}