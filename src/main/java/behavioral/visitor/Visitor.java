package behavioral.visitor;

import behavioral.visitor.visitables.HiTechGear;
import behavioral.visitor.visitables.Liquor;
import behavioral.visitor.visitables.Necessity;

public interface Visitor {

    Double visit(Liquor item);

    Double visit(Necessity item);

    Double visit(HiTechGear item);
}
