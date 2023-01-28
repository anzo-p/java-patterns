package behavioral.visitor;

public interface Visitable {

    double accept(Visitor visitor);
}
