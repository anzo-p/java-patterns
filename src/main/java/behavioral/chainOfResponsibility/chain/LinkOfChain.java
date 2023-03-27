package behavioral.chainOfResponsibility.chain;

import behavioral.chainOfResponsibility.Numbers;

public abstract class LinkOfChain {

    protected LinkOfChain nextInChain;

    public void setNextInChain(LinkOfChain next) {
        nextInChain = next;
    }

    abstract public void calculate(Numbers request);
}
