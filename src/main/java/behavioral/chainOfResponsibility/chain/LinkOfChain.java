package behavioral.chainOfResponsibility.chain;

import behavioral.chainOfResponsibility.Numbers;

public interface LinkOfChain {

    void setNextInChain(LinkOfChain next);

    void calculate(Numbers request);
}
