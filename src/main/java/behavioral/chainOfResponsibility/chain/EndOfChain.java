package behavioral.chainOfResponsibility.chain;

import behavioral.chainOfResponsibility.Numbers;

public class EndOfChain implements LinkOfChain {

    public void setNextInChain(LinkOfChain next) { }

    public void calculate(Numbers request) {
        System.out.println("Could not find a suitable processor for '" + request.getComputation() + "'");
    }
}
