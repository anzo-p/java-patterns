package behavioral.visitor.visitables;

import behavioral.visitor.Visitor;
import behavioral.visitor.Visitable;

public class HiTechGear implements Visitable {

    private Double price;

    public HiTechGear(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
