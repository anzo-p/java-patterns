package behavioral.chainOfResponsibility.chain.links;

import behavioral.chainOfResponsibility.Numbers;
import behavioral.chainOfResponsibility.chain.LinkOfChain;

import java.util.Objects;

public class IntegerDivideNumbers extends LinkOfChain {

    @Override
    public void calculate(Numbers request) {
        if (Objects.equals(request.getComputation(), "divide")) {
            System.out.println(request.getLeftTerm() + " / " + request.getRightTerm() + " = " + (request.getLeftTerm() / request.getRightTerm()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
