package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.chain.EndOfChain;
import behavioral.chainOfResponsibility.chain.LinkOfChain;
import behavioral.chainOfResponsibility.chain.links.AddNumbers;
import behavioral.chainOfResponsibility.chain.links.IntegerDivideNumbers;
import behavioral.chainOfResponsibility.chain.links.MultiplyNumbers;
import behavioral.chainOfResponsibility.chain.links.SubtractNumbers;

/*
    Chain of Responsibility

    Key concepts
    - Link up processors in some priority order
    - Pass computable arguments to first link in chain
    - The Links will either solve it or pass along
    - As an effect, the first suitable processor in chain will do it
    - Sort of prioritized, though flexible version of strategy pattern

    Key Objects
        Link

    Adding new Links to Chain
    - Implement a new link and link it to the chain

    In practice
        The Chain consists of Link Objects
        A link knows its next Link in chain or a default entity: EndOfChain
        The Link either executes its thing or calls the next Link in chain to its thing
        A provider may compose and edit the link dynamically
        The Client minimally needs to know the First Link of Chain
 */

public class Runner {

    public static void main(String[] args) {

        LinkOfChain additionLink = new AddNumbers();
        LinkOfChain subtractionLink = new SubtractNumbers();
        LinkOfChain multiplicationLink = new MultiplyNumbers();
        LinkOfChain divisionLink = new IntegerDivideNumbers();

        additionLink.setNextInChain(subtractionLink);
        subtractionLink.setNextInChain(multiplicationLink);
        multiplicationLink.setNextInChain(divisionLink);
        divisionLink.setNextInChain(new EndOfChain());

        Numbers requestAddition = new Numbers(77, 33, "add");
        Numbers requestSubtraction = new Numbers(77, 33, "subtract");
        Numbers requestMultiplication = new Numbers(77, 33, "multiply");
        Numbers requestDivision = new Numbers(77, 33, "divide");
        Numbers requestPower = new Numbers(77, 33, "power");

        additionLink.calculate(requestAddition);
        additionLink.calculate(requestSubtraction);
        additionLink.calculate(requestMultiplication);
        additionLink.calculate(requestDivision);
        additionLink.calculate(requestPower);
    }
}
