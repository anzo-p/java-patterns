package behavioral.state;

/*
    State

    Key concepts
    - An object to indicate current stage in a state machine
    - Aka a Vertex in the graph of state transitions
    - Publishes the Client facing API of state changing requests, which is shared by all states
    - Each state would have different responses to many or most requests
    - Primarily those responses sends signals to the Context to change the state
    - A Master object, now called 'Context', is needed to contain the state machine in order to coordinate the master logic

    Key Objects
        State, Context

    Adding a State
    - Implement the state changing behavior that is preferably enforced by an interface
    - Likely requires to add another state changing behavior, which all the other states must then also handle somehow

    In practice
        Think of the states as vertices and the state changing methods as edges in a graph
        Just that there is no graph but instead there is a Context object who contains all those states
        These states know of their context object and may call its state changing methods
 */

public class Runner {

    public static void main(String[] args) {

        /*
            Unfortunately the ATMMachineContext knows everything and Client is given full access to it
            This is solved with Proxy Design Pattern
         */
        ATMMachineContext atm = new ATMMachineContext();

        atm.ejectCard();

        System.out.println();

        atm.insertPin("0000");

        atm.requestCash(1000);

        System.out.println();

        atm.insertCard();

        atm.insertCard();

        atm.requestCash(1000);

        atm.insertPin("0000");

        atm.requestCash(1000);

        System.out.println();

        atm.insertCard();

        atm.insertPin("1234");

        atm.insertPin("0000");

        atm.insertPin("1234");

        atm.requestCash(3000);

        atm.requestCash(2001);

        atm.requestCash(2000);

        atm.ejectCard();

        System.out.println();

        atm.insertCard();

        atm.insertPin("1234");

        atm.requestCash(1);
    }
}
