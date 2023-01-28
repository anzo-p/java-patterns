package behavioral.visitor.visitables;

import behavioral.visitor.Visitor;
import behavioral.visitor.Visitable;

public class Liquor implements Visitable {

    private Double price;

    public Liquor(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
