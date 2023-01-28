package behavioral.visitor.visitors;

import behavioral.visitor.Visitor;
import behavioral.visitor.visitables.HiTechGear;
import behavioral.visitor.visitables.Liquor;
import behavioral.visitor.visitables.Necessity;

public class TaxVisitor implements Visitor {

    public TaxVisitor() { }

    public Double visit(Liquor item) {
        System.out.println("Liquor item - price with Tax (18%)");

        return item.getPrice() * 0.18 + item.getPrice();
    }

    public Double visit(Necessity item) {
        System.out.println("Necessity item - price with Tax (12%)");

        return item.getPrice() * 0.12 + item.getPrice();
    }

    public Double visit(HiTechGear item) {
        System.out.println("HiTechGear item - price with Tax (22%)");

        return item.getPrice() * 0.22 + item.getPrice();
    }
}
