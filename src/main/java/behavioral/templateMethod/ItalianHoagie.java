package behavioral.templateMethod;

public class ItalianHoagie extends Hoagie {

    String[] meatUsed = { "Salami", "Pepperoni", "Ham" };
    String[] cheeseUsed = { "Cheddar", "Gouda" };
    String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Cucumber" };
    String[] condimentsUsed = { "Oil", "Vinegar", "Salt" };

    void addMeat() {
        System.out.print("Meat was added - ");

        for (String meat : meatUsed) {
            System.out.print(meat +  " ");
        }
        System.out.println("");
    }

    void addCheese() {
        System.out.print("Cheese was added - ");

        for (String cheese : cheeseUsed) {
            System.out.print(cheese +  " ");
        }
        System.out.println("");
    }

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
