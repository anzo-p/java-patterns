package behavioral.templateMethod;

public class VeggieHoagie extends Hoagie {

    String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Cucumber", "Aubergine", "Cantrell", "Bell Pepper", "Hazel Nuts" };
    String[] condimentsUsed = { "Sesames Oil", "Vinegar", "Salt" };

    @Override
    boolean customerWantsMeatHook() { return false; }

    @Override
    boolean customerWantsCheeseHook() { return true; }

    void addMeat() { }

    void addCheese() { }

    void addVegetables() {
        System.out.print("Vegetables was added - ");

        for (String veggie : vegetablesUsed) {
            System.out.print(veggie +  " ");
        }
        System.out.println("");
    }

    void addCondiments() {
        System.out.print("Condiments were added - ");

        for (String condiment : condimentsUsed) {
            System.out.print(condiment +  " ");
        }
        System.out.println("");
    }
}

