package behavioral.chainOfResponsibility.chain.links;

import behavioral.chainOfResponsibility.Numbers;
import behavioral.chainOfResponsibility.chain.LinkOfChain;

import java.util.Objects;

public class AddNumbers implements LinkOfChain {

    private LinkOfChain nextInChain;

    public void setNextInChain(LinkOfChain next) {
        this.nextInChain = next;
    }

    public void calculate(Numbers request) {
        if (Objects.equals(request.getComputation(), "add")) {
            System.out.println(request.getLeftTerm() + " + " + request.getRightTerm() + " = " + (request.getLeftTerm() + request.getRightTerm()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
