package behavioral.templateMethod;

public abstract class Hoagie {

    final void makeSandwichTemplateMethod() {

        cutBun();

        if (customerWantsMeatHook()) {
            addMeat();
        }

        if (customerWantsCheeseHook()) {
            addCheese();
        }

        if (customerWantsVegetablesHook()) {
            addVegetables();
        }

        if (customerWantsCondimentsHook()) {
            addCondiments();
        }

        wrapHoagie();
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    boolean customerWantsMeatHook() { return true; }

    boolean customerWantsCheeseHook() { return true; }

    boolean customerWantsVegetablesHook() { return true; }

    boolean customerWantsCondimentsHook() { return true; }

    public void cutBun() {
        System.out.println("The Bun was cut");
    }

    public void wrapHoagie() {
        System.out.println("The Hoagie was wrapped\n");
    }
}
