package behavioral.memento;

public class Originator {

    private String article;

    /*
        shouldn't Originator Compose in a Caretaker?
        preferably construct it in a static getter-creator
        this way we needn't expose caretaker to Client
     */

    public void setArticle(String article) {
        System.out.println("[Originator] Setting current version of Article\n" + article);

        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public Memento storeInMemento() {
        System.out.println("[Originator] Saving to memento");

        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento) {
        this.article = memento.getArticle();

        System.out.println("[Originator] Retrieving from memento: " + this.article);

        return this.article;
    }
}
