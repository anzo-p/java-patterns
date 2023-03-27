package behavioral.chainOfResponsibility.chain.links;

import behavioral.chainOfResponsibility.chain.LinkOfChain;
import behavioral.chainOfResponsibility.Numbers;

import java.util.Objects;

public class SubtractNumbers extends LinkOfChain {

    @Override
    public void calculate(Numbers request) {
        if (Objects.equals(request.getComputation(), "subtract")) {
            System.out.println(request.getLeftTerm() + " - " + request.getRightTerm() + " = " + (request.getLeftTerm() - request.getRightTerm()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
