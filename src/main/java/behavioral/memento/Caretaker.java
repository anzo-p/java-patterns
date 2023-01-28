package behavioral.memento;

import java.util.ArrayList;

public class Caretaker {

    private final ArrayList<Memento> articleStore = new ArrayList<>();

    public void addMemento(Memento memento) {
        articleStore.add(memento);
    }

    public Memento peekMemento(int ix) {
        return articleStore.get(ix);
    }

    public Memento getAndRemoveMemento(int ix) {
        return articleStore.remove(ix);
    }
}
